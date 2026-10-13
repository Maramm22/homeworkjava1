package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void setName(String name) {
        if (!(name == null))
        this.name = name;
    }
    public void setAge(int age) {
        if (!(age < 0) ) {}
        this.age = age;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getIsMammal() {
        return isMammal;
    }
}

