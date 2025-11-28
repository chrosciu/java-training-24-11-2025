package eu.chrost.day5.servlet.lectures;

import java.util.List;

public class CarStorage {
    private static final List<Car> CARS = List.of(
        new Car("Toyota", "Corolla", 2020),
        new Car("Honda", "Civic", 2019),
        new Car("Ford", "Mustang", 2021),
        new Car("Chevrolet", "Camaro", 2018)
    );

    public static List<Car> getAllCars() {
        return CARS;
    }
}
