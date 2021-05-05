package com.foodstore.food.config;

import com.foodstore.food.model.Food;
import com.foodstore.food.model.FoodType;
import com.foodstore.food.model.Ratings;
import com.foodstore.food.repo.FoodRepository;
import com.foodstore.food.repo.FoodTypeRepository;
import com.foodstore.food.repo.RatingsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class FoodConfig {

    @Bean
    CommandLineRunner commandLineRunner (FoodRepository foodRepository,
                                         FoodTypeRepository foodTypeRepository,
                                         RatingsRepository ratingsRepository) {
        List<Food> foodList = new ArrayList<Food>();
        List<FoodType> foodTypeList = new ArrayList<FoodType>();
        List<Ratings> ratings = new ArrayList<Ratings>();


        return args -> {
            FoodType bolivian = new FoodType("bolivian");
            Food food1 = new Food("charque", "queso", "464654", bolivian);
            Food food2 = new Food("pato", "desc3", "464654", bolivian);
            foodList.add(food1);
            foodList.add(food2);
            foodTypeList.add(bolivian);
            Ratings ratings1= new Ratings(food1,5.0);
            Ratings ratings2= new Ratings(food1,1.0);
            ratings.add(ratings1);
            ratings.add(ratings2);
            foodTypeRepository.saveAll(foodTypeList);
            foodRepository.saveAll(foodList);
            ratingsRepository.saveAll(ratings);
        };
    }

}
