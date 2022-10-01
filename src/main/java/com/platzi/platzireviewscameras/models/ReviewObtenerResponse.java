package com.platzi.platzireviewscameras.models;

import com.platzi.platzireviewscameras.dto.ReviewDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewObtenerResponse {

    private ReviewDTO reviewDTO;
}
