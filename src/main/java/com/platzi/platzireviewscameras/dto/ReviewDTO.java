package com.platzi.platzireviewscameras.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.platzi.platzireviewscameras.dto.database.Autor;
import com.platzi.platzireviewscameras.dto.database.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReviewDTO {

    @JsonProperty(namespace = "id")
    private Long id;

    @JsonProperty(namespace = "titulo")
    private String titulo;

    @JsonProperty(namespace = "contenido")
    private String contenido;

    @JsonProperty(namespace = "idAutor")
    private Long idAutor;

    @JsonProperty(namespace = "idProducto")
    private Long idProducto;
}
