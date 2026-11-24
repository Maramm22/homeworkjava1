package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food>  {
    // OLD: private int nbrLegs;
    protected int nbrLegs;

    // OLD:
    // public Terrestrial(String name, String family, int age, boolean isMammal, int nbrLegs) {
    //     super(name, family, age, isMammal);
    //     this.nbrLegs = nbrLegs;
    // }
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(){}

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" + super.toString() + ", nbrLegs=" + nbrLegs + "}";
    }


    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " eats meat.");
        } else {
            System.out.println(getName() + " expected MEAT but got " + meat + ".");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println(getName() + " eats plants.");
        } else {
            System.out.println(getName() + " expected PLANT but got " + plant + ".");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " eats plants and meat.");
        } else {
            System.out.println(getName() + " expected BOTH but got " + food + ".");
        }
    }

}