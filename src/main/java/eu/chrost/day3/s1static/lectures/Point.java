package eu.chrost.day3.s1static.lectures;

public class Point {
    private final double x;
    private final double y;

    private static int counter = 0;

    //publiczna stala w ramach klasy
    public static final String CLASS_NAME = "Point";

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        ++counter;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void print() {
        System.out.println(getCounter());
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static int getCounter() {
        //nie dziala bo nie ma powiazania z konkretnym obiektem
        //System.out.println(x);
        //jak wyzej
        //System.out.println(this);
        return counter;
    }

    public static void main(String[] args) {
        //nie kompiluje sie - brak kontekstu obiektu
        //System.out.println(x);
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        System.out.println(Point.getCounter()); //2
    }
}
