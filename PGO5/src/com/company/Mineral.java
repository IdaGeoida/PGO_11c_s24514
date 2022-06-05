package com.company;

public class Mineral extends Ingredient {
    private int power;

    Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        setPower(power);
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + power;
    }


}
