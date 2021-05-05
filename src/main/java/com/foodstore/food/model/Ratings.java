package com.foodstore.food.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Ratings implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @ManyToOne
    private Food food;
    private double rating;

    public Ratings() {
    }

    public Ratings(Food food, double rating) {
        this.food = food;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "id=" + id +
                ", food=" + food +
                ", rating=" + rating +
                '}';
    }
}
