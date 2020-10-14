package br.com.bechepechesoftware.mapper;

import org.mapstruct.MappingTarget;

public interface GenericMapper<ENTITY, DTO> {

    DTO toDto(ENTITY entity);

    ENTITY toEntity(DTO dto);

    ENTITY update(ENTITY source, @MappingTarget ENTITY target);

}
