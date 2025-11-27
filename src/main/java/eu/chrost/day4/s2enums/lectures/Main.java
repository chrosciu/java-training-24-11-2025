package eu.chrost.day4.s2enums.lectures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WeekDay[] weekDays = WeekDay.values();
        System.out.println(Arrays.toString(weekDays));
        WeekDay today = WeekDay.THURSDAY;
        System.out.println(today.name());
        System.out.println(today.ordinal());
        WeekDay monday = WeekDay.valueOf("MONDAY");
        System.out.println(monday);
        System.out.println("Is " + today + " a weekend? " + isWeekend(today));
        System.out.println("Is " + today + " a weekend? " + today.isWeekend());
        System.out.println(today.greet());
        WeekDay friday = WeekDay.FRIDAY;
        System.out.println(friday.greet());
    }

    private static boolean isWeekend(WeekDay day) {
        return day == WeekDay.SATURDAY || day == WeekDay.SUNDAY;
    }
}
