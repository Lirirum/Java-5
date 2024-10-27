/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.example.beans;

import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;
import java.util.Date;

/**
 *
 * @author lirir
 */
@Named(value = "currentDataBean")
@Dependent
public class currentDateBean {

    private Date currentDate;

    public currentDateBean() {
        this.currentDate = new Date(); // Ініціалізація поточною датою
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}

