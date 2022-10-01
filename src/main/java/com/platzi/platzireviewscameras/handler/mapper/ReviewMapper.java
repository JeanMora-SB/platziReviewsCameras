package com.platzi.platzireviewscameras.handler.mapper;

import com.platzi.platzireviewscameras.dto.ReviewDTO;
import com.platzi.platzireviewscameras.dto.database.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    Review dtoToEntity(ReviewDTO reviewDTO);

    @Mapping(target = "autor",ignore = true)
    @Mapping(target = "producto",ignore = true)
    ReviewDTO EntitytoDTO(Review review);

    List<ReviewDTO> EntitytoDTOList(List<Review> review);
}
