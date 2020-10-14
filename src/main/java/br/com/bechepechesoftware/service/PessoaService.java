package br.com.bechepechesoftware.service;

import br.com.bechepechesoftware.domain.entity.Pessoa;
import br.com.bechepechesoftware.repository.PessoaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional(rollbackOn = Exception.class)
public class PessoaService extends GenericService<PessoaRepository, Pessoa, Long> {
}
