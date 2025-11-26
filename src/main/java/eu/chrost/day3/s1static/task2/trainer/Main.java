package eu.chrost.day3.s1static.task2.trainer;

import static eu.chrost.day3.s1static.task2.trainer.Calculator.PI;
import static eu.chrost.day3.s1static.task2.trainer.Calculator.multiply;

public class Main {
    public static void main(String[] args) {
        double liczba1 = 0;
        double liczba2 = 3;
        System.out.println(Calculator.add(liczba1, liczba2));
        System.out.println(Calculator.subtract(liczba1, liczba2));
        System.out.println(multiply(liczba1, liczba2));
        System.out.println(Calculator.divide(liczba1, liczba2));
        System.out.println(Calculator.add(PI, Calculator.E));
        System.out.println(Calculator.subtract(PI, Calculator.E));
    }
}
