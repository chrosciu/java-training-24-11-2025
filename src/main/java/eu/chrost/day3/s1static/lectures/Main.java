package eu.chrost.day3.s1static.lectures;

public class Main {
    public static void main(String[] args) {
        int counterBefore = Point.getCounter();
        System.out.println("Counter before creating points: " + counterBefore);

        Point p1 = new Point(1.0, 2.0);
        int counterAfterP1 = Point.getCounter();
        System.out.println("Counter after creating p1: " + counterAfterP1);

        p1.getCounter(); // działa, ale niezalecane

        System.out.println(Point.CLASS_NAME);

        //nie kompiluje sie - konstruktor jest prywatny
        //Weather weather = new Weather();

        Weather weather = Weather.getInstance();
        System.out.println("Current temperature: " + weather.getTemperature());

        Weather anotherWeather = Weather.getInstance();
        System.out.println("Are both weather instances the same? " + (weather == anotherWeather));
    }
}
