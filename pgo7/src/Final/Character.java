package Final;

import java.util.ArrayList;

public class Character {

    String name;
    int health = 100;
    static Location location;
    public static ArrayList<Character> character = new ArrayList<>();
    private static ArrayList<Character> target = new ArrayList<>(); //?? + add database
    public Character(String name) {
        this.name = name;
    }

    public Character(String name, Location location) {
        this.name = name;
        setLocation(location);
        character.add(this);
    }

    public static void status() {
        System.out.println("====Status====");
        for (int i = 0; i < character.size(); i++) {
            if (!character.get(i).getClass().equals(Orphanage.class))
            System.out.println(character.get(i).name + " : " + character.get(i).health);
        }
        System.out.println("==============");
    }


    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public static void MoveAllTo(Location location, Character first, Character secound) {
        first.location = location;
        secound.location = location;
    }

    public void moveTo(Location location){
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void moveTo(Orphanage woolsOrphanage) {
        setLocation(woolsOrphanage.getLocation());
    }

    public Location getLocation() {
        return location;
    }

    public void say(String s, Character character) {
        System.out.println(
                name + " to " + character.getName() + "\n   " + s
        );
    }

    private String getName() {
        return name;
    }

    public void doSth(String s) {
        System.out.println(
                "I am " + getName() + ", I am " + s
        );
    }

    public static void doSth(String s, Character character1,Character character2, Character character3){
        character1.doSth(s);
        character2.doSth(s);
        character3.doSth(s);
    }

    public void addChild(Character character){
        character.setLocation(this.getLocation());
    }

    public void target(Character character) {
        target.add(character);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void castSpell(Spell s) {
        for (int i = 0; i < target.size(); i++) {
            if (!(s == Spell.AvadaKedavra && target.get(i).name.equals("Harry"))) {
                    character.get(character.indexOf(target.get(i))).setHealth(character.get(i).getHealth() - 100);
                if(target.get(i).getHealth() > 0){
                    System.out.println(target.get(i).getName()+" goes LOL...");
                } else {
                    System.out.println(target.get(i).getName()+" died.");
                }
                } else {
                System.out.println(target.get(i).getName()+" goes LOL...");
                character.get(character.indexOf(this)).health=0;
                System.out.println(character.get(character.indexOf(this)).getName()+" died.");
            }


        }
    }


}
