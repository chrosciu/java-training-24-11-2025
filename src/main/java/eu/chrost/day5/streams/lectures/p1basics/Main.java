package eu.chrost.day5.streams.lectures.p1basics;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

record User(String name, int age) {}

class UserToNameMapper implements Function<User, String> {
    @Override
    public String apply(User user) {
        return user.name();
    }
}

class OlderThan40Predicate implements Predicate<User> {
    @Override
    public boolean test(User user) {
        return user.age() > 40;
    }
}

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
                .map(new UserToNameMapper())
                .toList();
//        Stream<User> usersStream = USERS.stream();
//        Stream<String> namesStream = usersStream.map(new UserToNameMapper());
//        List<String> names = namesStream.toList();
//        return names;

//        List<String> names = new ArrayList<>();
//        for (User user : USERS) {
//            names.add(user.name());
//        }
//        return names;
    }

    private static List<String> getUsersAbove40Names() {
        return USERS.stream()
                .filter(new OlderThan40Predicate())
                .map(new UserToNameMapper())
                .toList();

//        List<String> names = new ArrayList<>();
//        for (User user : USERS) {
//            if (user.age() > 40) {
//                names.add(user.name());
//            }
//        }
//        return names;
    }

    private static long getUsersBelowOrEqual40Count() {
        return USERS.stream()
                .filter(new OlderThan40Predicate().negate())
                .count();
//        long count = 0;
//        for (User user : USERS) {
//            if (user.age() <= 40) {
//                count++;
//            }
//        }
//        return count;
    }
}
