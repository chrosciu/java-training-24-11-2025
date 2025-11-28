package eu.chrost.day5.streams.task1.student;

import eu.chrost.day5.streams.task1.Car;
import eu.chrost.day5.streams.task1.Color;

import java.util.List;

import static eu.chrost.day5.streams.task1.Cars.CARS;

public class Main {
    public static void main(String[] args) {
        List<String> carBrands = CARS.stream()
                .map(car -> car.brand())
                .toList();
        System.out.println("Car brands: " + carBrands);

        List<Car> redCars = CARS.stream()
                .filter(car -> car.color() == Color.RED)
                .toList();
        System.out.println("Red cars: " + redCars);

    }
}
