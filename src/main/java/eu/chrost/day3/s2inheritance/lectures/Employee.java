package eu.chrost.day3.s2inheritance.lectures;

import java.util.Objects;

public class Employee /* extends Object */ {
    protected final String name;
    protected final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String prepareInfo() {
        return "Name: " + name + ", salary: " + salary;
    }

    public static String prepareClassName() {
       return "Employee";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
