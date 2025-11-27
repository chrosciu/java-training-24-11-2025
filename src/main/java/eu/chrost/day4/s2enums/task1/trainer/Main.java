package eu.chrost.day4.s2enums.task1.trainer;

public class Main {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + " is monochromatic: " + color.isMonochromatic());
        }
    }
}
