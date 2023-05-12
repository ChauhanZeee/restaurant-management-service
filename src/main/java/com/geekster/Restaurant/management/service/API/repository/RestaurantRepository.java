package com.geekster.Restaurant.management.service.API.repository;

import com.geekster.Restaurant.management.service.API.model.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantModel,Integer> {
}
