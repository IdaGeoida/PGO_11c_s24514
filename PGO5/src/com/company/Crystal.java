package com.company;

public class Crystal extends Mineral {
    private int magicPower;

    Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        setMagicPower(magicPower);
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + magicPower;
    }
}
