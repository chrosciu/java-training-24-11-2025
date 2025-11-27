package eu.chrost.day3.s4sealed.lectures;

public abstract sealed class Animal permits Bird, Cat, Dog {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String greet();
}
