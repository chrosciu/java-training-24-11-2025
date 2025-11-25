package eu.chrost.day2.s3classes.task1.trainer;

class Main {
    public static void main(String[] args) {
        BankAccount konto1 = new BankAccount();
        BankAccount konto2 = new BankAccount("12345");
        BankAccount konto3 = new BankAccount("5678", 500);
        System.out.println("Konta:");
        konto1.print();
        konto2.print();
        konto3.print();
        konto1.deposit(500);
        konto1.print();
        konto2.withdraw(1000);
        konto2.print();
        konto3.withdraw(200);
        konto3.print();
        System.out.println(konto1.getBalance());
        System.out.println(konto2.getAccountNumber());
    }
}
