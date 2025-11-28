package eu.chrost.day5.streams.lectures.p2anonymous;

import java.util.List;
import java.util.function.Function;

record User(String name, int age) {}

public class Main {
    public static final List<User> USERS = List.of(
            new User("Marcin", 43),
            new User("Tomasz", 39),
            new User("Pawel", 36)
    );

    public static void main(String[] args) {
        System.out.println("All users names: " + getUsersNames());
    }

    private static List<String> getUsersNames() {
        return USERS.stream()
                .map(new Function<User, String>() {
                    @Override
                    public String apply(User user) {
                        return user.name();
                    }
                })
                .toList();
    }
}

