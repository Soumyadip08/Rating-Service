package com.lcwd.rating.services;
import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface RatingService {
    //create
    Rating createRating(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    // get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get allby hotel
    List<Rating>getRatingByHotelId(String hotelId);

}
