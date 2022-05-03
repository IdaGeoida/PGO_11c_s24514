package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private List<ShoppingCart> History;
    private ShoppingCart Current;

    public void MakeOrder(){
        ShoppingCart cart = new ShoppingCart();
        this.Current = cart;
    }

    public Person(@NotNull String name, @NotNull String surname, @NotNull double moneyInCash, @NotNull double moneyOnCard) {
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public void BuyByCard(){
        if(this.Current.getTotalPrice()<=this.moneyOnCard && Current!=null){
            History.add(Current);
            moneyOnCard-=this.Current.getTotalPrice();
            Current.sell();
            Current=null;
        }
    }

    public void BuyByCash(){
        if(this.Current.getTotalPrice()<=this.moneyInCash && Current!=null){
            History.add(Current);
            moneyInCash-=this.Current.getTotalPrice();
            Current.sell();
            Current=null;
        }
    }
}
