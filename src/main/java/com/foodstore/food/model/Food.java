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
        private String type;
        private String description;
        private String imageUrl;


    public Food() {
    }

    public Food(String name, String type, String description, String imageUrl) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.imageUrl = imageUrl;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
