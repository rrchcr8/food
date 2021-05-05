package com.foodstore.food.repo;

import com.foodstore.food.model.FoodType;
import com.foodstore.food.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingsRepository extends JpaRepository<Ratings, Long> {

    List<Ratings> findAllByFoodId(Long foodId);
}
