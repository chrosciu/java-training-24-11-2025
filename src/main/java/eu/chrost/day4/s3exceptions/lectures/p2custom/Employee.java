package eu.chrost.day4.s3exceptions.lectures.p2custom;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            //throw new IllegalArgumentException("Age is invalid : " + age + " - should be at least 18");
            throw new InvalidAgeException(age);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
