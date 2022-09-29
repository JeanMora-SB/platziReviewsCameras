package com.platzi.platzireviewscameras.handler.mapper;

import com.platzi.platzireviewscameras.dto.AutorDTO;
import com.platzi.platzireviewscameras.dto.database.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AutorMapper {

    Autor dtoToEntity(AutorDTO autorDto);

    @Mapping(target = "telefono",ignore = true)
    AutorDTO EntitytoDTO(Autor autor);
}
