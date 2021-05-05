package com.foodstore.food.utils;

import com.foodstore.food.model.Food;
import com.foodstore.food.model.Ratings;

import java.util.List;

public class Average {

public static Food setFoodAverage(List<Ratings> ratingsList, Food food){
    double sum =0;
    double average;
    for (Ratings rating: ratingsList
    ) {
        sum= sum + rating.getRating();
    }
    average = sum/ratingsList.size();
    food.setRating(average);
    return food;
    }
}
