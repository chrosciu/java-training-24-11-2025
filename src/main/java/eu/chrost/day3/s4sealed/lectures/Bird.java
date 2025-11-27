package eu.chrost.day3.s4sealed.lectures;

public sealed class Bird extends Animal permits Canary {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Chirp! I'm " + name;
    }
}
