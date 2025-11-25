package eu.chrost.day2.s3classes.lectures;

public class RestrictedPoint {
    //do pola typu public mozna sie dostac z kazdego miejsca w programie
    //public double x;
    //public double y;

    //do pola o widocznosci domyslnej mozna dostepowac z kazdego miejsca w tym samym pakiecie
    //double x;
    //double y;

    //do pola typu private mozna sie dostac tylko z wnetrza tej samej klasy
    private double x;
    private double y;

    //konstruktor mozna zawolac wszedzie - jest publiczny
    public RestrictedPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metody dostepowe do pol prywatnych - moga byc publiczne, odczyt nic nie psuje
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //wypisywanie zawartosci - tez moze byc publiczne
    public void print() {
        System.out.println("RestrictedPoint(" + x + ", " + y + ")");
    }

    //metody modyfikujace pola prywatne - moga byc publiczne, ale z logika
    //ale w tym przypadku ograiczylem dostep tylko do tego samego pakietu
    void setX(double x) {
        if (isPositive(x)) {
            this.x = x;
        }
    }

    private boolean isPositive(double value) {
        return value > 0;
    }
}
