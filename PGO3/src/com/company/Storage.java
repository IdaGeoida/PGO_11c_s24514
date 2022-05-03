package com.company;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Storage {
    private int deliveryTime;

    public int getDeliveryTime(){
        return this.deliveryTime;
    }

    public Storage(@NotNull int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public static Storage st1 = new Storage(10);
}
