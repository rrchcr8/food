package com.foodstore.food.controller;

import com.foodstore.food.model.Food;
import com.foodstore.food.model.Ratings;
import com.foodstore.food.service.FoodService;
import com.foodstore.food.service.RatingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodService foodService;
    private final RatingsService ratingsService;


    public FoodController(FoodService foodService, RatingsService ratingsService) {
        this.foodService = foodService;
        this.ratingsService = ratingsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Food>> getAllFood(){
        List<Food> foods = foodService.findAllFoods();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Long id){
        Food food = foodService.findFoodById(id);
        List<Ratings> ratings = ratingsService.findAllByFoodId(id);
        double sum =0;
        double average;
        for (Ratings rating: ratings
             ) {
            sum= sum + rating.getRating();
        }
        average = sum/ratings.size();
        food.setRating(average);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }


}
