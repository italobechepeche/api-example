package br.com.bechepechesoftware.service;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;

@Transactional(rollbackOn = Exception.class)
public abstract class GenericService<REPO extends PanacheRepositoryBase<ENTITY, ID>, ENTITY, ID> {

    @Inject
    REPO repository;

    public List<ENTITY> listAll() {
        return repository.listAll();
    }

    public ENTITY findById(ID id) {
        return repository.findByIdOptional(id)
                .orElseThrow(() -> new WebApplicationException(Response.Status.NOT_FOUND));
    }

    public ENTITY save(ENTITY pessoa) {
        repository.persist(pessoa);
        return pessoa;
    }

    public void delete(ID id) {
        repository.delete(findById(id));
    }
}
