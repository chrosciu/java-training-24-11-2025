package eu.chrost.day4.s1interfaces.task1.trainer;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Alice", 80000);
        Manager manager = new Manager("Bob", 120000);
        developer.work();
        manager.work();
        double devBonus = developer.calculateBonus();
        double mgrBonus = manager.calculateBonus();
        System.out.println("Developer Bonus: " + devBonus);
        System.out.println("Manager Bonus: " + mgrBonus);
    }
}
