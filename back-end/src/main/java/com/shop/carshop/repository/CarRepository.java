package com.shop.carshop.repository;

import com.shop.carshop.models.Car;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String>{

}