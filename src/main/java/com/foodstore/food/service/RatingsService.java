package com.foodstore.food.service;

import com.foodstore.food.model.Ratings;
import com.foodstore.food.repo.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingsService {
private final RatingsRepository ratingsRepository;

@Autowired
    public RatingsService(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }


    public List<Ratings> findAllByFoodId(Long id) {
    return ratingsRepository.findAllByFoodId(id);
    }

    public Ratings addRating(Ratings ratings){
        return  ratingsRepository.save(ratings);
    }
}
