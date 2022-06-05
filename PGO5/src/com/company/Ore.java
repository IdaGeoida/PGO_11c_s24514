package com.company;

public class Ore extends Mineral {
    private boolean metallic;

    Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        setMetallic(metallic);
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    public int getReagent() {
        if (metallic == true) {
            return super.getReagent();
        } else {
            return super.getReagent() / 2;
        }
    }

}
