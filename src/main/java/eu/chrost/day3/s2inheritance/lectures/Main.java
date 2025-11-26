package eu.chrost.day3.s2inheritance.lectures;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        System.out.println(employee.prepareInfo());

        Manager manager = new Manager("Jane Smith", 80000, "IT");
        System.out.println(manager.getName());
        System.out.println(manager.prepareInfo());

        System.out.println(employee);
        System.out.println(manager);

        Employee anotherEmployee = new Employee("Alice Johnson", 90000);

        System.out.println(employee.equals(anotherEmployee));

        Employee copyOfEmployee = new Employee("John Doe", 50000);
        System.out.println(employee.equals(copyOfEmployee));
    }
}
