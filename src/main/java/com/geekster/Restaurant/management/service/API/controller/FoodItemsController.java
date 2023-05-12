package com.geekster.Restaurant.management.service.API.controller;

import com.geekster.Restaurant.management.service.API.model.FoodItems;
import com.geekster.Restaurant.management.service.API.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodItemsController {
    @Autowired
    FoodItemService foodItemService;
    @PostMapping(value = "/addFoods")
    public void addingFood(@RequestBody FoodItems foodItems){
        foodItemService.addingFood(foodItems);
    }

}
