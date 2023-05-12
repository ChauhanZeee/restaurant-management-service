package com.geekster.Restaurant.management.service.API.service;

import com.geekster.Restaurant.management.service.API.model.RestaurantModel;
import com.geekster.Restaurant.management.service.API.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public void addRestaurant(RestaurantModel restaurantModel) {
        restaurantRepository.save(restaurantModel);
    }
}
