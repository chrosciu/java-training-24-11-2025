package eu.chrost.day3.s4sealed.lectures;

non-sealed class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof! My name is: " + name;
    }

    public String fetch() {
        return name + " is fetching the ball!";
    }
}
