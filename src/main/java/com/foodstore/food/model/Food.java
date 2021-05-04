package com.foodstore.food.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Food implements Serializable {
        @Id
//        @SequenceGenerator(name = "food_sequence",
//                sequenceName = "food_sequence",
//                allocationSize = 1
//        )
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String name;
        @ManyToOne
        private FoodType foodType;
//        private String type;
        private double rating;
        private String description;
        private String imageUrl;


    public Food() {
    }

    public Food(String name, String description, String imageUrl, FoodType foodType, double rating) {
        this.name = name;
        this.foodType= foodType;
//        //this.type = type;
        this.description = description;
        this.imageUrl = imageUrl;
        this.rating=rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foodType=" + foodType +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
