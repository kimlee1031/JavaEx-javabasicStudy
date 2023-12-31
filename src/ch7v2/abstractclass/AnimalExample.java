package ch7v2.abstractclass;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        Animal animal = null;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animalSound(new Dog());
        animalSound(new Cat());
        
    }


    private static void animalSound(Animal animal) {
        animal.sound();

    }
}
