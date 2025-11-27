package eu.chrost.day3.s4sealed.lectures;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");
        Canary canary = new Canary("Tweety");

        System.out.println(dog.greet());
        System.out.println(cat.greet());
        System.out.println(canary.greet());
    }

    private String describe(Animal animal) {
        return switch (animal) {
            case null -> "No animal provided";
            case Canary c -> "This is a canary named " + c.name;
            case Dachshund d -> "This is a dachshund named " + d.name + ", woof!" + d.fetch();
            case Dog d -> "This is a dog named " + d.name + ", woof!" + d.fetch();
            case Cat c -> "This is a cat named " + c.name;
            case Bird b -> "This is a canary named " + b.name;
        };
    }

    private String describeOld(Animal animal) {
        if (animal instanceof Dog d) {
            return "This is a dog named " + d.name + ", woof!" + d.fetch();
        } else if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            return "This is a cat named " + c.name;
        } else if (animal instanceof Bird) {
            Bird b = (Bird) animal;
            return "This is a bird named " + b.name;
        } else {
            return "Unknown animal";
        }
    }
}
