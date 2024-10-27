package com.example.beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import java.util.List;

/**
 *
 * @author lirir
 */
@Named(value = "dataController")
@RequestScoped
public class DataController {
    
    
    
    @Inject
    private DataContainer dataContainer;

    private String newItem="";

    public String getNewItem() {
        return newItem;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }
    
    @POST
    public void addItem() {
        if (newItem != null && !newItem.isEmpty()) {
            dataContainer.addItem(newItem);
            this.newItem = ""; 
        }
        
    }

    public void removeItem(String item) {
        dataContainer.removeItem(item);
    }
    
    @GET
     public List<String> getData() {
        return dataContainer.getData();
    }
    
}
