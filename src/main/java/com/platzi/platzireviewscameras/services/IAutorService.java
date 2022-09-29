package com.platzi.platzireviewscameras.services;

import com.platzi.platzireviewscameras.models.AutorRequest;
import com.platzi.platzireviewscameras.models.AutorResponse;

public interface IAutorService {

    AutorResponse saveAutor(AutorRequest autorRequest);
}
