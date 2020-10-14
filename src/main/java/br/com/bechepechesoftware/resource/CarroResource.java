package br.com.bechepechesoftware.resource;

import br.com.bechepechesoftware.domain.dto.CarroDTO;
import br.com.bechepechesoftware.domain.entity.Carro;
import br.com.bechepechesoftware.mapper.CarroMapper;
import br.com.bechepechesoftware.mapper.GenericMapper;
import br.com.bechepechesoftware.service.CarroService;
import br.com.bechepechesoftware.service.GenericService;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/carro")
public class CarroResource extends GenericResource<Carro, CarroDTO, Long> {

    @Inject
    CarroService service;

    @Inject
    CarroMapper mapper;


    @Override
    protected GenericService<? extends PanacheRepositoryBase<Carro, Long>, Carro, Long> getService() {
        return service;
    }

    @Override
    protected GenericMapper<Carro, CarroDTO> getMapper() {
        return mapper;
    }
}
