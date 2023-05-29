package com.lcwd.rating.services.impl;
import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repositories.RatingRepository;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepo;

    // create
    @Override
    public Rating createRating(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepo.save(rating);
    }

    //get all ratings
    @Override
    public List<Rating> getRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepo.findByUserId(userId) ;
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
