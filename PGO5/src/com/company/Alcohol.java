package com.company;

public class Alcohol extends Liquid {
    private int percent;

    Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }

    public void setPercent(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.percent = percent;
        } else {
            throw new RuntimeException("Procenty powinny mieścić się w przedziale od 0 do 100");
        }
    }

    @Override
    public int getReagent() {
        return super.getReagent() - percent;
    }
}
