package com.platzi.platzireviewscameras.controller;

import com.platzi.platzireviewscameras.dto.database.Autor;
import com.platzi.platzireviewscameras.models.AutorRequest;
import com.platzi.platzireviewscameras.models.AutorResponse;
import com.platzi.platzireviewscameras.services.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api/v1/review", produces = MediaType.APPLICATION_JSON_VALUE)
public class AutorController {

    @Autowired
    AutorServiceImpl autorServiceImpl;

    @PostMapping("/autor")
    public ResponseEntity<AutorResponse> saveAutor(@RequestBody AutorRequest autorRequest){

        AutorResponse autorResponse = autorServiceImpl.saveAutor(autorRequest);
        return new ResponseEntity<>(autorResponse, HttpStatus.OK);
    }
}
