package br.com.bechepechesoftware.repository;

import br.com.bechepechesoftware.domain.entity.Pessoa;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PessoaRepository implements PanacheRepositoryBase<Pessoa, Long> {
}
