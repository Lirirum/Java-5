package com.example.beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */



import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lirir
 */
@Named(value = "dataContainer")
@ApplicationScoped
public class DataContainer {
    
    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void addItem(String item) {
        data.add(item);
    }

    public void removeItem(String item) {
        data.remove(item);
    }
}
