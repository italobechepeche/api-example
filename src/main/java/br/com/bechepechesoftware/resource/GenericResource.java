package br.com.bechepechesoftware.resource;

import br.com.bechepechesoftware.mapper.GenericMapper;
import br.com.bechepechesoftware.service.GenericService;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

/**
 *
 * @param <ENTITY>
 * @param <DTO>
 * @param <ID>
 */
public abstract class GenericResource <ENTITY, DTO, ID> {

    protected abstract GenericService<? extends PanacheRepositoryBase<ENTITY, ID>, ENTITY, ID> getService();

    protected abstract GenericMapper<ENTITY, DTO> getMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response.ok(
                getService().listAll()
                        .stream()
                        .map(p -> getMapper().toDto(p))
                        .collect(Collectors.toList())
        ).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public DTO findById(@PathParam("id") ID id) {
        return getMapper().toDto(getService().findById(id));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(DTO entityDTO) {
        ENTITY entity = getService().save(getMapper().toEntity(entityDTO));

        return Response.status(Response.Status.CREATED).entity(getMapper().toDto(entity)).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional(value = Transactional.TxType.REQUIRES_NEW)
    public Response update(DTO entityDTO, @PathParam("id") ID id) {
        ENTITY entityUpdated = getMapper().update(getMapper().toEntity(entityDTO), getService().findById(id));
        getService().save(entityUpdated);

        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response delete(@PathParam("id") ID id) {
        getService().delete(id);

        return Response.noContent().build();
    }

}