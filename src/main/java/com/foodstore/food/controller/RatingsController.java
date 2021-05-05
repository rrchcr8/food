package com.foodstore.food.controller;

import com.foodstore.food.model.Ratings;
import com.foodstore.food.service.RatingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingsController {
    private final RatingsService ratingsService;

    public RatingsController(RatingsService ratingsService) {
        this.ratingsService = ratingsService;
    }

    @PostMapping("/add")
    public ResponseEntity<Ratings> addRating(@RequestBody Ratings ratings){
        Ratings newRating = ratingsService.addRating(ratings);
        return new ResponseEntity<>(newRating, HttpStatus.CREATED);
    }


}
