package com.company;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Vehicle {
    private String name;
    private LocalDate creationDate;
    private List<Integer> wheels;

    public Vehicle(String name, LocalDate creationDate, List<Integer> wheels) {
        this.name = name;
        this.creationDate = creationDate;
        this.wheels = wheels;
    }
    //TODO validate
    public Vehicle(String name, List<Integer> wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    //obowiazkowe
    public Vehicle(String name, int wheel1, int wheel2) {
        this.name = name;
        this.wheels = new ArrayList<>();
        this.wheels.add(wheel1);
        this.wheels.add(wheel2);
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            System.out.println(System.err);
            return;
        }
        this.name = name;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setWheels(List<Integer> wheels) {
        if(wheels==null || wheels.isEmpty()){
            System.out.println(System.err);
            return;
        }
        this.wheels = wheels;
    }
}
