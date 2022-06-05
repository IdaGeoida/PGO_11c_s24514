package com.company;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {
    private final String name;
    private boolean isCreated = false;
    private final List<Ingredient> ingredients;
    private int power;
    private Liquid catalyst = null;


    public Eliksir(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }

    private int power() {
        if (isCreated == false) {
            for (int i = 0; i < ingredients.size(); i++) {
                this.power = power + ingredients.get(i).getReagent();
            }
        } else {
            throw new RuntimeException("Nie udało się utworzyć eliksiru");
        }
        return power;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredient == null) {
            throw new RuntimeException("Nie można dodać składnika będącego nullem");
        } else if (isCreated == false) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if (isCreated == false) {
            ingredients.remove(ingredient);
        }
    }

    public String showIngredient(List<Ingredient> ingredients) {
        String test = "";
        for (int i = 0; i < ingredients.size(); i++) {
            test = test + ingredients.get(i).getName() + ", ";
        }
        return test;
    }

    public void create() {
        power();
        power = power() / catalyst.getReagent();
        isCreated = true;

    }

    public String getCatalyst() {
        return catalyst.getName();
    }

    public void setCatalyst(Liquid katalizator) {
        if (isCreated != true) {
            if (catalyst == null) {
                this.catalyst = katalizator;
            } else {
                throw new RuntimeException("Katalizator został już ustawiony");
            }
        } else {
            throw new RuntimeException("Ten eliksir został już utworzony");
        }
    }

    @Override
    public String toString() {
        return "Przygotowany przez Ciebie eliksir:" + '\n' +
                "nazwa: " + name + '\n' +
                "czy został przyrządzony?: " + isCreated + '\n' +
                "składniki: " + showIngredient(ingredients) + '\n' +
                "moc: " + power + '\n' +
                "katalizator: " + getCatalyst();
    }
}
