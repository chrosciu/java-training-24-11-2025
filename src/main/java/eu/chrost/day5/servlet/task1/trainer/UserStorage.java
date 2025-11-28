package eu.chrost.day5.servlet.task1.trainer;

import java.util.List;

public class UserStorage {
    public static List<User> getAllUsers() {
        return List.of(
                new User("John", "Doe"),
                new User("Jane", "Smith"),
                new User("Alice", "Johnson")
        );
    }
}
