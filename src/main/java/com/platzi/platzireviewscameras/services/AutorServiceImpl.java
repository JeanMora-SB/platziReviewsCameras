package com.platzi.platzireviewscameras.services;

import com.platzi.platzireviewscameras.dto.AutorDTO;
import com.platzi.platzireviewscameras.dto.database.Autor;
import com.platzi.platzireviewscameras.handler.mapper.AutorMapper;
import com.platzi.platzireviewscameras.models.AutorRequest;
import com.platzi.platzireviewscameras.models.AutorResponse;
import com.platzi.platzireviewscameras.repository.AutorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AutorServiceImpl implements IAutorService {

    @Autowired
    AutorRepository autorRepository;

    @Autowired
    AutorMapper autorMapper;

    @Override
    public AutorResponse saveAutor(AutorRequest autorRequest) {

        Autor autor=autorMapper.dtoToEntity(autorRequest.getAutorDto());

        AutorDTO autorDto=autorMapper.EntitytoDTO(autorRepository.save(autor));
        AutorResponse autorResponse=new AutorResponse();
        autorResponse.setAutorDto(autorDto);

        return autorResponse;
    }
}
