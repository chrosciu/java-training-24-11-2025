package eu.chrost.day5.streams.lectures.p3lambdas;

import java.util.List;

record User(String name, int age) {}

public class Main {
    public static final List<User> USERS = List.of(
            new User("Marcin", 43),
            new User("Tomasz", 39),
            new User("Pawel", 36)
    );

    public static void main(String[] args) {
        System.out.println("All users names: " + getUsersNames());
        System.out.println("Users above 40 names: " + getUsersAbove40Names());
        System.out.println("Count of users below 40: " + getUsersBelowOrEqual40Count());
    }

    private static List<String> getUsersNames() {
        return USERS.stream()
                .map(user -> user.name())
                .toList();
    }

    private static List<String> getUsersAbove40Names() {
        return USERS.stream()
                .filter((user -> user.age() > 40))
                .map(user -> user.name())
                .toList();
    }

    private static long getUsersBelowOrEqual40Count() {
        return USERS.stream()
                .filter(user -> user.age() <= 40)
                .count();
    }
}
