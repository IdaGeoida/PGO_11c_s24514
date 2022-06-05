package com.company;

public class Water extends Liquid {
    private boolean distilated;

    Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        setDistilated(distilated);
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {
        if (distilated) {
            return super.getReagent();
        } else {
            return super.getReagent()/2;
        }
    }

}
