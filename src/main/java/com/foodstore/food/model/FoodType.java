package com.foodstore.food.model;

import javax.persistence.*;

@Entity
@Table
public class FoodType {

    @Id
//        @SequenceGenerator(name = "food_sequence",
//                sequenceName = "food_sequence",
//                allocationSize = 1
//        )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;

    public FoodType() {
    }

    public FoodType(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "FoodType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
