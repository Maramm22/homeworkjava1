package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
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
}