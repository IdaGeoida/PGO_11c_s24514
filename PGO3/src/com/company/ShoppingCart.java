package com.company;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart {

    private int id;
    private double totalPrice=0;
    private int totalDeliveryTime;
    private List<Products> products;

    public ShoppingCart() {
        this.id = SafeCounter.getValue();
    }

    public ShoppingCart(List<Products> products) {
        this.products = products;
        this.id = SafeCounter.getValue();
        this.totalPrice+=products.stream().mapToDouble(Products::getPrice).sum();
        this.totalDeliveryTime=products.stream().mapToInt(Products::getDeliveryTime).sum();
    }

    public int getId() {
        return this.id;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void sell(){
        products.forEach(Products::sell);
    }
}

