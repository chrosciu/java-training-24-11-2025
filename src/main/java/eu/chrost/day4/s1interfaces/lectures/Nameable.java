package eu.chrost.day4.s1interfaces.lectures;

public sealed interface Nameable permits Animal, Car, ExtraNameable {
    String getName();
}
