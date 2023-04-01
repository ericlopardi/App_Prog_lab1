/*
 * Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */

public abstract class Theropod implements Dinosaur {
    private String name;
    private boolean isVegetarian;

    public Theropod (String name, boolean isVegetarian) {
        this.name = name;
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String isVegetarianString = isVegetarian() ? "not carnivore" : "carnivore";
        String toString = "* Theropod: %s named %s (%s)\n";
        return String.format(toString, getSubType(), getName(), isVegetarianString);
    }

    public String getType() {
        return getSubType();
    }

    public abstract String getSubType();
}