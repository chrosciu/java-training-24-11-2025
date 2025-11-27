package eu.chrost.day4.s1interfaces.lectures;

public record Car(String brand, String model) implements Nameable {
    @Override
    public String getName() {
        return brand + " " + model;
    }
}
