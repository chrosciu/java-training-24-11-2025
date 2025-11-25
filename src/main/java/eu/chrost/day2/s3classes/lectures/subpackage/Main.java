package eu.chrost.day2.s3classes.lectures.subpackage;

import eu.chrost.day2.s3classes.lectures.RestrictedPoint;

public class Main {
    public static void main(String[] args) {
        RestrictedPoint rp1 = new RestrictedPoint(5.0, 7.0);
        rp1.print();
        //nie kompiluje sie - metoda setX() moze byc zawolana tylko z tego samego pakietu
        //rp1.setX(15.0);
        rp1.print();
    }
}
