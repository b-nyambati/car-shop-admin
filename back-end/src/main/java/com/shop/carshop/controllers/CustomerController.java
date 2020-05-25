package com.shop.carshop.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

import com.shop.carshop.models.Customer;
import com.shop.carshop.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customer;
    }
    // void save(Optional<Customer> customerToUpdate){
    //     customerRepository.saveCust(customerToUpdate);
    // }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/owners")
    public List<Customer> getOwner(){
        return customerRepository.findAll();
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id){
        customer.setId(id);
        customerRepository.save(customer);

        return customer;
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable String id){
        return customerRepository.findById(id);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable String id){
        customerRepository.deleteById(id);
        return "customer with id: " + id + " has been deleted";
    }
}