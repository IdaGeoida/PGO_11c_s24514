package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static int getValue() {
        return counter.getAndIncrement();
    }
}
