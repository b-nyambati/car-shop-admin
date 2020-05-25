package com.shop.carshop.models;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int orders;

    public Customer(){}

    public Customer(String id, String firstName, String lastName, String phoneNumber, String email, int orders){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName; 
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orders = orders;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getOrders(){
        return orders;
    }

    public void setOrders(int orders){
        this.orders = orders;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}