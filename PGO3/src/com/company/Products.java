package com.company;

import org.jetbrains.annotations.NotNull;

public class Products {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private boolean isAvailable = quantity>0;
    private Storage whereStored;

    public Products(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        this.isAvailable = quantity>0;
    }

    public Products(@NotNull String name, @NotNull ProductType productType, @NotNull double price, @NotNull int quantity, Storage storage) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        this.isAvailable = quantity>0;
        this.whereStored = storage;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void increaseQuantity(int n){
        this.quantity+=n;
    }

    public int getDeliveryTime(){
        if (this.whereStored == null) return 0;
        else return this.whereStored.getDeliveryTime();
    }

    public void sell() {
        this.quantity--;
    }

}