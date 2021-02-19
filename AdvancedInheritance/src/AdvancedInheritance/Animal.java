package AdvancedInheritance;

public abstract class Animal {
    public String name;
    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String animalName) {
        this.name = animalName;
    }
}
