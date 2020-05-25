package com.shop.carshop.repository;

import java.util.Optional;

// import java.util.Optional;

import com.shop.carshop.models.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	// void saveCust(Optional<Customer> customerToUpdate);
    
}