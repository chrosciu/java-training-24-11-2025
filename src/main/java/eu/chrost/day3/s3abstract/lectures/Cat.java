package eu.chrost.day3.s3abstract.lectures;

public final class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Meow! I do not want do say anything but if you want... I'm " + name;
    }
}
