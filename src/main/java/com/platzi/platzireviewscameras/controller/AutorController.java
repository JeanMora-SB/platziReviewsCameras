package com.platzi.platzireviewscameras.controller;

import com.platzi.platzireviewscameras.dto.database.Autor;
import com.platzi.platzireviewscameras.models.AutorObtenerResponse;
import com.platzi.platzireviewscameras.models.AutorSaveRequest;
import com.platzi.platzireviewscameras.models.AutorSaveResponse;
import com.platzi.platzireviewscameras.repository.AutorRepository;
import com.platzi.platzireviewscameras.services.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/v1/review", produces = MediaType.APPLICATION_JSON_VALUE)
public class AutorController {

    @Autowired
    AutorServiceImpl autorServiceImpl;

    @PostMapping("/save/autor")
    public ResponseEntity<AutorSaveResponse> saveAutor(@RequestBody AutorSaveRequest autorSaveRequest){

        AutorSaveResponse autorSaveResponse = autorServiceImpl.saveAutor(autorSaveRequest);
        return new ResponseEntity<>(autorSaveResponse, HttpStatus.OK);
    }

    @GetMapping("/autor")
    public List<AutorObtenerResponse> obtenerAutores(){

        return autorServiceImpl.getAllAutor();
    }
}
