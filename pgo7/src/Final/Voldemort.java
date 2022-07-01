package Final;

import java.util.ArrayList;

public class Voldemort extends Character{
    ArrayList<Integer> horcruxes = new ArrayList<>();

    public Voldemort(Riddle tom) {
        super(tom.name = "Lord Voldemort");
        character.set(character.indexOf(tom), this);
    }

    public void createHorcruxes(int count) {
        for (int i = 1; i <= count; i++) {
            horcruxes.add(i);
        }
    }

    public void printHorcruxes() {
        System.out.println("Created horcruxes:");
        for (int i = 1; i <= horcruxes.size(); i++) {
            System.out.println("    horcrux " + i);
        }
    }

}
