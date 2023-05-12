package com.geekster.Restaurant.management.service.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FoodItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;
    private String foodName;
    private boolean availability;
    private String foodType;
    @ManyToOne(cascade = CascadeType.ALL)
    RestaurantModel restaurantModel;
}
