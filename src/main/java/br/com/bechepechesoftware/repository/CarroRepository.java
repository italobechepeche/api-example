package br.com.bechepechesoftware.repository;

import br.com.bechepechesoftware.domain.entity.Carro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarroRepository implements PanacheRepositoryBase<Carro, Long> {
}
