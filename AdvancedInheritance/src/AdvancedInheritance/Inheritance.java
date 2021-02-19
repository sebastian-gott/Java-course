package AdvancedInheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        dog.setName("Adrian");
        cow.setName("Sindre");
        talkingAnimal(dog);
        talkingAnimal(cow);
        WorkingDog doggi = new WorkingDog();
        doggi.setHoursOfTraining(1000);
        doggi.work();
        System.out.println(doggi.getHoursOfTraining());


    }

    public static void talkingAnimal(Animal animal) {
        System.out.println("Come on, come on");
        System.out.println("See animals");
        System.out.println(animal.getName() + " says");
        animal.speak();
        System.out.println("*******");
    }

}
