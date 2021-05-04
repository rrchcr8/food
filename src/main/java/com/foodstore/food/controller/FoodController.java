package com.foodstore.food.controller;

import com.foodstore.food.model.Food;
import com.foodstore.food.service.FoodService;
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


    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Food>> getAllFood(){
        List<Food> foods = foodService.findAllFoods();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Long id){
        Food food = foodService.findFoodById(id);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }


}
