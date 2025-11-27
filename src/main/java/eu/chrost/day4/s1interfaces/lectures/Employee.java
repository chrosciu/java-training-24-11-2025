package eu.chrost.day4.s1interfaces.lectures;

public final class Employee extends Worker implements ExtraNameable {

    private final String name;
    private final String surname;
    private final int age;

    public Employee(String name, String surname, int salary, int age) {
        super(salary);
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFullName() {
        return name + " " + surname;
    }
}
