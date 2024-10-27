package com.example.beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */


import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author lirir
 */
@Named(value = "personController")
@RequestScoped 
public class PersonController {
     private String name="";
    
    private int age;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
