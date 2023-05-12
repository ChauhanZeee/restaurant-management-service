package com.geekster.Restaurant.management.service.API.service;

import com.geekster.Restaurant.management.service.API.model.FoodItems;
import com.geekster.Restaurant.management.service.API.repository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo iFoodItemRepo;
    public void addingFood(FoodItems foodItems) {
        iFoodItemRepo.save(foodItems);
    }
}
