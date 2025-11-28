package eu.chrost.day4.s3exceptions.lectures.p2custom;

import lombok.SneakyThrows;

public class Employee {
    private final String name;
    private final int age;

    @SneakyThrows
    public Employee(String name, int age) {
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
