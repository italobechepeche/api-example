package br.com.bechepechesoftware.resource;

import br.com.bechepechesoftware.domain.dto.PessoaDTO;
import br.com.bechepechesoftware.domain.entity.Pessoa;
import br.com.bechepechesoftware.mapper.GenericMapper;
import br.com.bechepechesoftware.mapper.PessoaMapper;
import br.com.bechepechesoftware.service.GenericService;
import br.com.bechepechesoftware.service.PessoaService;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/pessoa")
public class PessoaResource extends GenericResource<Pessoa, PessoaDTO, Long> {

    @Inject
    PessoaService service;

    @Inject
    PessoaMapper mapper;

    @Override
    protected GenericService<? extends PanacheRepositoryBase<Pessoa, Long>, Pessoa, Long> getService() {
        return service;
    }

    @Override
    protected GenericMapper<Pessoa, PessoaDTO> getMapper() {
        return mapper;
    }
}