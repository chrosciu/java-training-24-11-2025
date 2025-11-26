package eu.chrost.day3.s2inheritance.lectures;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);

        Manager manager = new Manager("Jane Smith", 80000, "IT");

        Employee hiddenManager = manager;

        //blad kompilacji - nie mozna robic rzutowania w dol bezposrednio
        // (nie kazdy pracownik jest managerem)
        //Manager fakeManager = employee;

        //kompiluje sie, ale w runtime rzuci ClassCastException
        //Manager fakeManager = (Manager)employee;

        //trzeba zrobic rzutowanie wprost
        Manager revealedManager = (Manager)hiddenManager;

        System.out.println(revealedManager.prepareInfo());

        //wolam metode prepareInfo na referencji typu Employee
        System.out.println(hiddenManager.prepareInfo());

        System.out.println(employee.prepareClassName());
        System.out.println(manager.prepareClassName());
        //statyczne metody nie podlegaja polimorfizmowi - zostanie wywolana metoda z klasy Employee
        System.out.println(hiddenManager.prepareClassName());
        System.out.println(revealedManager.prepareClassName());

        //w rzeczywistosci powinno sie to wolac w ten sposob
        System.out.println(Employee.prepareClassName());
        System.out.println(Manager.prepareClassName());
    }
}
