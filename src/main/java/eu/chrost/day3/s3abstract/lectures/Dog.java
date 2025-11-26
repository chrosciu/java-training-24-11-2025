package eu.chrost.day3.s3abstract.lectures;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public final String greet() {
        return "Woof! My name is: " + name;
    }
}
