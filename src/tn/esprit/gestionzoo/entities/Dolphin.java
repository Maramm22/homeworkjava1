package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    // OLD: private float swimmingSpeed;
    protected float swimmingSpeed;

    public Dolphin() {}

    // OLD (the extra "}" after the constructor closed the class too early):
    // public Dolphin(String name,String family,int age,boolean isMammal,String habitat,float swimmingSpeed) {
    //     super(name,family,age,isMammal,habitat);
    //     this.swimmingSpeed = swimmingSpeed;
    //     }
    // }
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // OLD:
    // @Override
    // public String toString() {
    //     return super.toString()+"The Dolphin's swimmingSpeed= " + swimmingSpeed ;
    // }
    @Override
    public String toString() {
        return "Dolphin{" + super.toString() + ", swimmingSpeed=" + swimmingSpeed + "}";
    }

    @Override
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}