package com.company;

public class Liquid extends Ingredient {

    private int dissolubility;

    Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.setDissolubility(dissolubility);
    }

    private int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if (dissolubility >= 0 && dissolubility <= 100) {
            this.dissolubility = dissolubility;
        } else {
            throw new RuntimeException("Podaj wartość od 0 do 100");
        }
    }

    @Override
    public int getReagent() {
        return getDissolubility();
    }
}
