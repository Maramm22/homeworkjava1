package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    // OLD: private String habitat;
    protected String habitat;

    // OLD:
    // public Aquatic(String name, String family, int age, boolean isMammal, String habitat) {
    //     super(name, family, age, isMammal);
    //     this.habitat = habitat;
    // }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic(){
        super();
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // OLD:
    // @Override
    // public String toString() {
    //     return super.toString() +
    //             "habitat='" + habitat + '\'' +
    //             '}';
    // }
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return getName().equals(other.getName())
                && getAge() == other.getAge()
                && habitat.equals(other.habitat);
    }
}