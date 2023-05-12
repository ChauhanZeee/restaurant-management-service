package com.geekster.Restaurant.management.service.API.controller;

import com.geekster.Restaurant.management.service.API.model.FoodItems;
import com.geekster.Restaurant.management.service.API.model.RestaurantModel;
import com.geekster.Restaurant.management.service.API.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value = "/adding/newRestaurant")
    public String addRestaurant(@RequestBody RestaurantModel restaurantModel){
        List<FoodItems> foodItemsList = restaurantModel.getFoodItemsList();
        for(FoodItems foodItems: foodItemsList){
            foodItems.setRestaurantModel(restaurantModel);
        }
        restaurantService.addRestaurant(restaurantModel);
        return "added successfully";
    }
}
