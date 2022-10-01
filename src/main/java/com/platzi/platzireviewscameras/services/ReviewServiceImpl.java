package com.platzi.platzireviewscameras.services;

import com.platzi.platzireviewscameras.dto.ReviewDTO;
import com.platzi.platzireviewscameras.dto.database.Review;
import com.platzi.platzireviewscameras.handler.mapper.ReviewMapper;
import com.platzi.platzireviewscameras.models.AutorObtenerResponse;
import com.platzi.platzireviewscameras.models.ReviewObtenerResponse;
import com.platzi.platzireviewscameras.models.ReviewSaveRequest;
import com.platzi.platzireviewscameras.models.ReviewSaveResponse;
import com.platzi.platzireviewscameras.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ReviewServiceImpl implements IReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public ReviewSaveResponse saveReview(ReviewSaveRequest reviewSaveRequest) {
        Review review=reviewMapper.dtoToEntity(reviewSaveRequest.getReviewDTO());

        log.info("Review: {}",review);

        ReviewDTO reviewDto=reviewMapper.EntitytoDTO(reviewRepository.save(review));
        ReviewSaveResponse reviewSaveResponse =new ReviewSaveResponse();
        reviewSaveResponse.setReviewDTO(reviewDto);

        return reviewSaveResponse;
    }

    @Override
    public List<ReviewObtenerResponse> getAllReviews() {
        List<ReviewDTO> reviewDto=reviewMapper.EntitytoDTOList(reviewRepository.findAll());
        List<ReviewObtenerResponse> reviewObtenerResponse=new ArrayList<>();
        for (int i = 0; i < reviewDto.size(); i++) {
            reviewObtenerResponse.add(new ReviewObtenerResponse());
        }
        final int[] i = {0};
        reviewObtenerResponse.forEach(x->{
            x.setReviewDTO(reviewDto.get(i[0]));
            i[0]++;
        });
        log.info("autorResponse, {}: ",reviewObtenerResponse);
        return reviewObtenerResponse;
    }
}
