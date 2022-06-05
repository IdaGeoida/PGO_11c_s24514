package com.company;

public abstract class Ingredient {

    private String name;
    private int baseReagent;

    Ingredient(String name, int baseReagent) {
        setName(name);
        setReagent(baseReagent);
    }

    public int getReagent() {
        return baseReagent;
    }

    public void setReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
