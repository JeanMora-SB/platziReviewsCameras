package com.platzi.platzireviewscameras.controller;

import com.platzi.platzireviewscameras.models.ReviewObtenerResponse;
import com.platzi.platzireviewscameras.models.ReviewSaveRequest;
import com.platzi.platzireviewscameras.models.ReviewSaveResponse;
import com.platzi.platzireviewscameras.services.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/v1/tiendabreit", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReviewController {

    @Autowired
    ReviewServiceImpl reviewServiceImpl;

    @PostMapping("/save/review")
    public ResponseEntity<ReviewSaveResponse> saveReview(@RequestBody ReviewSaveRequest reviewSaveRequest){

        ReviewSaveResponse reviewSaveResponse = reviewServiceImpl.saveReview(reviewSaveRequest);
        return new ResponseEntity<>(reviewSaveResponse, HttpStatus.OK);
    }

    @GetMapping("/review")
    public List<ReviewObtenerResponse> obtenerAutores(){

        return reviewServiceImpl.getAllReviews();
    }
}
