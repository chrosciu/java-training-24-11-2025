package eu.chrost.day3.s3abstract.lectures;

public class AnimalShelter {
    private Animal[] animals = new Animal[0];

    public void admit(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; ++i) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public void displayGreetings() {
        for (Animal animal : animals) {
            System.out.println(animal.greet());
        }
    }
}
