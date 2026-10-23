package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    // OLD: private float swimmingDepth;
    protected float swimmingDepth;

    public Penguin() {}

    // OLD:
    // public Penguin(String habitat, float swimmingDepth) {
    //     this.habitat = habitat;
    //     this.swimmingDepth = swimmingDepth;
    // }
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString() + ", swimmingDepth=" + swimmingDepth + "}";
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }
}