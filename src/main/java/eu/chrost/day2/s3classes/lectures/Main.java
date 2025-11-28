package eu.chrost.day2.s3classes.lectures;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.5);
        p1.x = 3.5;
        p1.y = 4.5;
        p1.print();

        Point p2 = new Point();
        p2.x = 1.0;
        p2.y = 2.0;
        p2.print();

        Point p3 = new Point(1.0);
        p3.print();

        RestrictedPoint rp1 = new RestrictedPoint(5.0, 7.0);
        //nie kompiluje sie - pole jest prywatne i nie ma do niego dostepu
        //rp1.x = 5.0;
        //nie kompiluje sie - metoda jest prywatna i nie ma do niej dostepu
        //rp1.isPositive(0);
        System.out.println(rp1.getX());
        System.out.println(rp1.getY());
        rp1.print();
        rp1.setX(15.0);
        rp1.print();
        rp1.setX(-3.0);
        rp1.print();

        ImmutablePoint ip1 = new ImmutablePoint(2.0, 4.0);
        System.out.println(ip1.getX());
        System.out.println(ip1.getY());
        ip1.print();
        System.out.println(ip1);

        ImmutablePoint ip2 = new ImmutablePoint(2.0, 4.0);
        System.out.println(ip1.equals(ip2));
    }
}
