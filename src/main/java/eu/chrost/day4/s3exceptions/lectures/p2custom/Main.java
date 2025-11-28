package eu.chrost.day4.s3exceptions.lectures.p2custom;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            Employee employee = new Employee("Marcin", 17);
        } catch (Exception e) {
            if (e instanceof InvalidAgeException e1) {
                throw new BusinessAgeException(e1);
            }
        }
    }
}
