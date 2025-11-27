package eu.chrost.day4.s1interfaces.task1.trainer;

public abstract class Employee implements Payable {
    protected final String name;
    protected final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
}
