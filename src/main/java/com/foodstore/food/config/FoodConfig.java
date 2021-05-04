package com.foodstore.food.config;

import com.foodstore.food.model.Food;
import com.foodstore.food.model.FoodType;
import com.foodstore.food.repo.FoodRepository;
import com.foodstore.food.repo.FoodTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class FoodConfig {

    @Bean
    CommandLineRunner commandLineRunner (FoodRepository foodRepository, FoodTypeRepository foodTypeRepository) {
        List<Food> foodList = new ArrayList<Food>();
        List<FoodType> foodTypeList = new ArrayList<FoodType>();

        return args -> {
            FoodType bolivian = new FoodType("bolivian");
            Food food1 = new Food("charqie", "queso", "464654", bolivian,4.0);
            Food food2 = new Food("pato", "desc3", "464654", bolivian,4.0);
            foodList.add(food1);
            foodList.add(food2);
            foodTypeList.add(bolivian);
            foodTypeRepository.saveAll(foodTypeList);
            foodRepository.saveAll(foodList);
        };
    }

}
