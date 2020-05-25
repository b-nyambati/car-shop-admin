package com.shop.carshop.models;

import org.springframework.data.annotation.Id;

public class Car {
    @Id
    private String id;
    private String ownerId;
    private String color;
    private String model;
    private String make;
    private String year;
    private String price;

    public Car(){}
    public Car(String id, String ownerId, String color, String model, String make, String year, String price){
        this.id = id; this.ownerId = ownerId; this.color = color;
        this.model = model; this.make = make;
        this.year = year; this.price = price;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getOwnerId(){
        return ownerId;
    }

    public void setOwnerId(String ownerId){
        this.ownerId = ownerId;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

}