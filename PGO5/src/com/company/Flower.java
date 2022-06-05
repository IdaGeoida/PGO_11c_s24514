package com.company;

public class Flower extends Plants {

    Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() * 2;
    }
}
