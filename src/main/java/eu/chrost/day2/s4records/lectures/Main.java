package eu.chrost.day2.s4records.lectures;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.5);
        System.out.println(p1.x());
        System.out.println(p1.y());

        String pointAsString = p1.toString();
        System.out.println(pointAsString);

        Point p2 = new Point(3.5, 4.5);
        System.out.println(p1.equals(p2));

    }
}
