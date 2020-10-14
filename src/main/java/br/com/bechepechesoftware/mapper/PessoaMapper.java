package br.com.bechepechesoftware.mapper;

import br.com.bechepechesoftware.domain.dto.PessoaDTO;
import br.com.bechepechesoftware.domain.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PessoaMapper extends GenericMapper<Pessoa, PessoaDTO> {
}
