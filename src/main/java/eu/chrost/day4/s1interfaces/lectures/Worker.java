package eu.chrost.day4.s1interfaces.lectures;

public abstract class Worker {
    protected final int salary;

    public Worker(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
