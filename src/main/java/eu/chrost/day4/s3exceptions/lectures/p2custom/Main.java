package eu.chrost.day4.s3exceptions.lectures.p2custom;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            Employee employee = new Employee("Marcin", 17);
        } catch (InvalidAgeException e) {
            throw new BusinessAgeException(e);
        }
    }
}
