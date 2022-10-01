package com.platzi.platzireviewscameras.controller;

import com.platzi.platzireviewscameras.dto.database.Producto;
import com.platzi.platzireviewscameras.models.AutorObtenerResponse;
import com.platzi.platzireviewscameras.models.ProductoObtenerResponse;
import com.platzi.platzireviewscameras.repository.ProductoRepository;
import com.platzi.platzireviewscameras.services.IProductoService;
import com.platzi.platzireviewscameras.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/api/v1/tiendabreit", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoServiceImpl;

    @GetMapping("/producto")
    public List<ProductoObtenerResponse> obtenerProductos(){

        return productoServiceImpl.getAllProducts();
    }
}
