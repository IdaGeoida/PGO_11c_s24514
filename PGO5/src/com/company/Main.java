package com.company;

public class Main {
    public static void main(String[] args) {

        Water notDistilatedWater = new Water("Woda niedestylowana", 40, 95, false);
        Crystal lapisLazuli = new Crystal("Lapis lazuli", 10, 30, 1800);
        Root imbir = new Root("zelazo", 30, 120);
        Liquid gin = new Alcohol("wodka", 80, 80, 25);


        Eliksir eliksirMocy = new Eliksir("Eliksir Mocy (TM)");
        eliksirMocy.addIngredient(notDistilatedWater);
        eliksirMocy.addIngredient(lapisLazuli);
        eliksirMocy.addIngredient(gin);
        eliksirMocy.addIngredient(imbir);
        eliksirMocy.setCatalyst(notDistilatedWater);
        eliksirMocy.create();
        System.out.println(eliksirMocy);

    }
}
