package eu.chrost.day2.s3classes.task1.trainer;

class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; //mozna bez this
    }

    public BankAccount() {
        this("0000", 0.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("BankAccount{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}');
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
