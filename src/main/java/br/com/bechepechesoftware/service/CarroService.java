package br.com.bechepechesoftware.service;

import br.com.bechepechesoftware.domain.entity.Carro;
import br.com.bechepechesoftware.repository.CarroRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional(rollbackOn = Exception.class)
public class CarroService extends GenericService<CarroRepository, Carro, Long> {
}
