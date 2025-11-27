package eu.chrost.day4.s1interfaces.lectures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Greeter.greet(dog);
        Employee employee = new Employee("Alice", "Johnson",2000, 25);
        Greeter.greet(employee);

        Nameable hiddenDog = dog;

        Dog revealedDog = (Dog)hiddenDog;

        if (hiddenDog instanceof Dog d) {
            System.out.println("The dog's age is: " + d.getAge());
        }

        switch (hiddenDog) {
            case Dog d -> System.out.println("The dog's age via switch is: " + d.getAge());
            case Employee e -> System.out.println("It's an employee named: " + e.getName());
            case Car c -> System.out.println("It's a car named: " + c.getName());
        }

        ExtraNameable hiddenEmployee = employee;

        System.out.println(hiddenEmployee.getFullName());

        // nie kompiluje sie poniewaz Dog nie implementuje ExtraNameable
        //ExtraNameable hiddenDogAsExtraNameable = dog;

        Dog anotherDog = new Dog("Max", 5);

        Dog thirdDog = new Dog("Charlie", 2);

        Dog[] dogs = {anotherDog, dog, thirdDog};

        System.out.println(Arrays.toString(dogs));

        //Arrays.sort(dogs);
        Arrays.sort(dogs, new NameableComparator().reversed());

        System.out.println(Arrays.toString(dogs));


    }
}
