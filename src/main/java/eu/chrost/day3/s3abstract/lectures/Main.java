package eu.chrost.day3.s3abstract.lectures;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");

        System.out.println(dog.greet());
        System.out.println(cat.greet());

        //nie kompiluje sie - nie mozna stworzyc instancji klasy abstrakcyjnej
        //Animal animal = new Animal();
        //natomiast mozna stworzyc referencje do klasy abstrakcyjnej
        Animal animal = dog;

        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.admit(dog);
        animalShelter.admit(cat);
        animalShelter.displayGreetings();
    }
}
