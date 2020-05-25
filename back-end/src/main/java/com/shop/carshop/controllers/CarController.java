package com.shop.carshop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shop.carshop.models.Car;
import com.shop.carshop.models.Customer;
import com.shop.carshop.repository.CarRepository;
import com.shop.carshop.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/api/v1/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        car.setPrice("$" + car.getPrice());
        carRepository.save(car);
        return car;
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestBody Car newCar, @PathVariable String id){
        if(newCar.getOwnerId() != null){
            Optional<Customer> customerToUpdate = customerRepository.findById(newCar.getOwnerId());
            customerToUpdate.get().setOrders(customerToUpdate.get().getOrders() + 1);
            // customerRepository.saveCust(customerToUpdate);
        }
        return carRepository.findById(id).map(car -> {
            car.setOwnerId(newCar.getOwnerId());
            car.setColor(newCar.getColor());
            car.setMake(newCar.getMake());
            car.setModel(newCar.getModel());
            car.setYear(newCar.getYear());
            if(!newCar.getPrice().contains("$"))
                car.setPrice("$" + newCar.getPrice());
            car.setPrice(newCar.getPrice());
            return carRepository.save(car);
        }).orElseGet(() -> {
            newCar.setId(id);
            return carRepository.save(newCar);
        });
    }

    @GetMapping("/purchased")
    public List<Car> getPurchasedCars(){
        List<Car> purchasedCars = new ArrayList<Car>();

        for (Car car : carRepository.findAll()) {
            if(car.getOwnerId() != null) purchasedCars.add(car);
        }
        return purchasedCars;
    }

    @GetMapping
    public List<Car> getCarsInStock(){// in stock
        List<Car> carList = new ArrayList<Car>();

        for (Car car : carRepository.findAll()){
            if(car.getOwnerId() == null) carList.add(car);

        }
        
        return carList;
    }

    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable String id){
        return carRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable String id){
        carRepository.deleteById(id);
        return "Car with id: " + id + " has been deleted";
    }
}