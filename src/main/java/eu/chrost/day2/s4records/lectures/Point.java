package eu.chrost.day2.s4records.lectures;

public record Point(double x, double y) {
    public Point() {
        this(0, 0);
    }

    //mozna nadpisac konstruktor kanoniczny
//    public Point {
//        if (x < 0 || y < 0) {
//            throw new IllegalArgumentException("Coordinates must be non-negative");
//        }
//        //java dodaje niejawne przypisania do pol
//    }
}
