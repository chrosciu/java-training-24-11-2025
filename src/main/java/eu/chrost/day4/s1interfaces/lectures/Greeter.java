package eu.chrost.day4.s1interfaces.lectures;

public class Greeter {
    public static void greet(Nameable nameable) {
        System.out.println("Hello, " + nameable.getName() + "!");
    }
}
