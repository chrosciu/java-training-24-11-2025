package eu.chrost.day3.s2inheritance.lectures;

import java.util.Objects;

public class Manager extends Employee {
    private final String department;

    public Manager(String name, double salary, String department) {
        //tutaj niejawnie jest wolany konstruktor domyślny klasy bazowej Employee()
        //poniewaz go nie ma to musimy jawnie wywolac inny konstruktor klasy bazowej
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String prepareInfo() {
        //return "Name: " + name + ", salary: " + salary + ", department: " + department;
        return super.prepareInfo() + ", department: " + department;
    }

    public static String prepareClassName() {
        return "Manager";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }
}
