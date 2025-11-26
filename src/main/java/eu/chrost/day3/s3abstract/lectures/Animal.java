package eu.chrost.day3.s3abstract.lectures;

public abstract class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String greet();
}
