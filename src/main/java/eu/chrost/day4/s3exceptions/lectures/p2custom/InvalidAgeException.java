package eu.chrost.day4.s3exceptions.lectures.p2custom;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Age is invalid : " + age + " - should be at least 18");
    }
}
