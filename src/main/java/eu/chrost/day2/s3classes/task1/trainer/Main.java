package eu.chrost.day2.s3classes.task1.trainer;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", 1000.0);
        BankAccount account2 = new BankAccount("0987654321");
        BankAccount account3 = new BankAccount();

        account1.print();
        account2.print();
        account3.print();
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Number: " + account2.getAccountNumber());
    }

}
