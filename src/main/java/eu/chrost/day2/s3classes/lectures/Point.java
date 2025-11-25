package eu.chrost.day2.s3classes.lectures;

import java.util.Objects;

public class Point {
    double x;
    double y;

    //domyslny konstruktor - jeśli nie zdefiniujemy żadnego konstruktora, to kompilator sam go doda
    //jesli jest jakikolwiek inny - kompilator go nie doda
    Point() {}

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //odwolanie do innego konstruktora tej samej klasy
    Point(double x) {
        this(x, 0);
    }

    void print() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
