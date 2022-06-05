package com.company;

public class Root extends Plants {

    Root(String name, int baseReagent, int power) {
        super(name, baseReagent, power);
    }

    @Override
    public int getReagent() {
        return super.getReagent()/2;
    }
}
