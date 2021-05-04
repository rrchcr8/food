package com.foodstore.food.service;

import com.foodstore.food.exception.UserNotFoundException;
import com.foodstore.food.model.Food;
import com.foodstore.food.repo.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAllFoods(){
        return foodRepository.findAll();
    }

    public Food findFoodById(Long id){
        return foodRepository.findFoodById(id).orElseThrow(() ->new UserNotFoundException("food by id: "+ id +" was not found"));
    }

}
