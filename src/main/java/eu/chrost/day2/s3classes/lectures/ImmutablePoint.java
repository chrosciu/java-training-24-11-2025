package eu.chrost.day2.s3classes.lectures;

public class ImmutablePoint {
    //pole typu final jest niezmienialne po przypisaniu wartości
    //i musi być zainicjalizowane w konstruktorze lub przy deklaracji
    final private double x;
    final private double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void print() {
        System.out.println("ImmutablePoint(" + x + ", " + y + ")");
    }

}
