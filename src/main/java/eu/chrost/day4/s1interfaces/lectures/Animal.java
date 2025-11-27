package eu.chrost.day4.s1interfaces.lectures;

public abstract sealed class Animal implements Nameable, Comparable<Animal> permits Dog {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal o) {
        if (null == o) {
            return 1;
        }
        return this.age - o.age;
    }
}
