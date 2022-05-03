package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {

	    Products product1 = new Products("Lorem ipsum",ProductType.Electronic,10.00,1);
        System.out.println(product1.isAvailable());
        Products product2 = new Products("Lorem ipsum",ProductType.Electronic,10.00,0, Storage.st1);
        System.out.println(product2.isAvailable());
        List<Products> list1 = new ArrayList<Products>();
        list1.add(product1);
        list1.add(product2);
        ShoppingCart cart1 = new ShoppingCart(list1);
        System.out.println(cart1.getId());
        ShoppingCart cart2 = new ShoppingCart();
        System.out.println(cart2.getId());
        System.out.println(product2.getDeliveryTime());
        System.out.println(product1.getDeliveryTime());
    }


}
