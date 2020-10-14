package br.com.bechepechesoftware.mapper;

import br.com.bechepechesoftware.domain.dto.CarroDTO;
import br.com.bechepechesoftware.domain.entity.Carro;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CarroMapper extends GenericMapper<Carro, CarroDTO> {
}
