package com.geekster.Restaurant.management.service.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RestaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;
    private String name;
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurantModel")
    private List<FoodItems> foodItemsList;

}
