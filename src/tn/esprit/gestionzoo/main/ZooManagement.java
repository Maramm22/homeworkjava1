package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String zooName;
        do {
            System.out.print("Enter the zoo name: ");
            zooName = input.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("Error: the name cannot be empty. Try again.");
            }
        } while (zooName.isEmpty());

        int nbrCages = 0;
        while (nbrCages <= 0) {
            System.out.print("Enter the number of cages: ");
            if (input.hasNextInt()) {
                nbrCages = input.nextInt();
                if (nbrCages <= 0) {
                    System.out.println("Error: the number must be greater than 0. Try again.");
                }
            } else {
                System.out.println("Error: please enter a whole number. Try again.");
                input.next(); // throw away the wrong input
            }
        }

        System.out.println(zooName + " has " + nbrCages + " cages.");


        //instruction 5
        /*Animal lion = new Animal();
        lion.name = "Lion";
        lion.age = 14 ;
        lion.isMammal = true;
        lion.family = "lions";
        Zoo myZoo = new Zoo();
        myZoo.name = "My Zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;*/


        //Animal giraffe = new Animal("Giraffidae", "Fafa", 7 , true);



        /*Zoo myZoo = new Zoo("Belvedere", "Tunis");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());*/

        Zoo myZoo = new Zoo(zooName, "Tunis");
        myZoo.displayZoo();

        //Instruction 21
        // OLD (Aquatic is abstract, it cannot be instantiated):
        // Aquatic a = new Aquatic();
        Terrestrial  t = new Terrestrial();
        Penguin p = new Penguin();
        Dolphin d = new Dolphin();

        //Instruction 22 + 23
        Terrestrial terrestrial = new Terrestrial("Felidae", "Simba", 5, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 35.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctica", 120.0f);

        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        //Instruction 24
        dolphin.swim();
        penguin.swim();

        //Instruction 26
        Dolphin dolphin2 = new Dolphin("Delphinidae", "Bubbles", 6, true, "Sea", 40.0f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Skipper", 3, false, "Antarctica", 150.0f);

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin2);

        //Instruction 27
        myZoo.displaySwimAquatics();

        //Instruction 28
        // OLD (Aquatic is abstract, it cannot be instantiated):
        // Aquatic aquatic = new Aquatic("Fish", "Nemo", 2, false, "Ocean");
        // System.out.println(aquatic);
        // aquatic.swim();

        //Instruction 29
        System.out.println("Max penguin depth: " + myZoo.maxPenguinSwimmingDepth());

        //Instruction 30
        myZoo.displayNumberOfAquaticsByType();

        //Instruction 31
        Dolphin dolphin3 = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 50.0f);
        System.out.println("dolphin equals dolphin3: " + dolphin.equals(dolphin3));
        System.out.println("dolphin equals dolphin2: " + dolphin.equals(dolphin2));

        input.close();
    }
}