package eu.chrost.day2.s3classes.task2.trainer;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Peugeot", "308");
        Car car3 = new Car("Peugeot", "3008", 2010);
        System.out.println("Samochody: ");
        car1.print();
        car2.print();
        car3.print();
        System.out.println(car3.isOlderThan(2009));
        displayCarProperties(car1);
    }

    private static void displayCarProperties(Car car) {
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
