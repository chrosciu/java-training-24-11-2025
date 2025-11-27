package eu.chrost.day3.s4sealed.lectures;

public class Dachshund extends Dog {
    public Dachshund(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof! I'm a dachshund and my name is " + name;
    }
}
