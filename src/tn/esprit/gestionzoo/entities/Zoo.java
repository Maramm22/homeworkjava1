package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
public class Zoo {
    private Animal[] animals = new Animal[25];
    private int nbrAnimals = 0;
    private String name;
    private String city;
    static final int nbrCages=3;

    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquatics = 0;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;

    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: the zoo name cannot be empty.");
        }
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }


    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("Zoo city: " + city);
        System.out.println("Zoo nbr cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo " + name + " in the city of " + city + " has " + nbrCages + " cages";
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Invalid age: " + animal.getAge() + ", " + animal.getName() + " cannot be added.");
        }
        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException("The zoo is full, " + animal.getName() + " cannot be added.");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }
    void displayAnimalsinthezoo() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }


    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                return i;
            }
        }
        return -1;
    }


    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false; // not in the zoo
        }
        // move every animal after it one place to the left
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null; // empty the last place
        nbrAnimals--;
        return true;
    }

    // OLD (it changed nbrAnimals and the condition was reversed):
    // boolean isZooFull(){
    //     for (int i = 0; i < animals.length; i++) {
    //         if (animals[i] != null) {
    //             nbrAnimals++;}
    //     }
    //     return nbrAnimals <= animals.length ;
    // }
    boolean isZooFull() {
        return nbrAnimals >= animals.length;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

//    //second method of iszoofull()
//    /*boolean isZooFull() {
//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i] == null) {
//                return false;
//            }
//        }
//        return true;
//    }*/

    static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }


    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < aquaticAnimals.length) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
        } else {
            System.out.println("No more room for aquatic animals");
        }
    }

    public void displaySwimAquatics() {
        for (int i = 0; i < nbrAquatics; i++) {
            aquaticAnimals[i].swim();
        }
    }


    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                // OLD: if (p.swimmingDepth > max) { max = p.swimmingDepth; }
                if (p.getSwimmingDepth() > max) {
                    max = p.getSwimmingDepth();
                }
            }
        }
        return max;
    }


    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Number of dolphins: " + nbrDolphins);
        System.out.println("Number of penguins: " + nbrPenguins);
    }
}