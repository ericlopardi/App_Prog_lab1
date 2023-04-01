/*
 * Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */

public class Park {

    private String name; // The Park name
    private int counter = 0;
    private int maxCapacity; // Max capacity of dinosaurs
    private Dinosaur[] dinosaurs;

    public Park(String enterName, int enterMaxCapacity) {
        this.name = enterName;
        this.maxCapacity = enterMaxCapacity;
        dinosaurs = new Dinosaur[enterMaxCapacity];
    }

    public String toString() {
        String w;
        w = "Welcome to " + name +"!\n" + "- - - - - - - - - - - - - \n";
        for (int i = 0; i < this.counter; i++) {
            w = w + dinosaurs[i].toString();
        }
        return w;
    }

    public void addDino(Dinosaur n) {
        dinosaurs[counter] = n;
        this.counter++;
    }
}
