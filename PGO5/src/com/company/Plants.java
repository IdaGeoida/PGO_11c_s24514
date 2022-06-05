package com.company;

public class Plants extends Ingredient {
    private int toxity;

    Plants(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        setToxity(toxity);
    }

    public void setToxity(int toxity) {
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * toxity;
    }
}
