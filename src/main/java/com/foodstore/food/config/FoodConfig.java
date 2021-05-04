package com.foodstore.food.config;

import com.foodstore.food.model.Food;
import com.foodstore.food.repo.FoodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class FoodConfig {

    @Bean
    CommandLineRunner commandLineRunner (FoodRepository foodRepository) {
        List<Food> foodList = new ArrayList<Food>();
        return args -> {
            Food food1 = new Food("Silpancho",
                    "Boliviana",
                    "nacional","sssss");
            Food food2 = new Food("Pique",
                    "Boliviana",
                    "riquito","sssss");
            foodList.add(food1);
            foodList.add(food2);
            foodRepository.saveAll(foodList);
        };
    }

}
