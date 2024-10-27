package com.example.beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;

/**
 *
 * @author lirir
 */
@Named(value = "valueBean")
@Dependent
public class ValueBean {

    private String value;

    public ValueBean() {
        this.value = ""; // Ініціалізація порожнім значенням
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
