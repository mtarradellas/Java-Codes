package TP5.Bank;

public abstract class BankAccount {

    protected double balance;
    protected int id;

    protected BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void extract(double amount) throws IllegalShitBrah{
        if(!canExtract(amount))
            throw new IllegalShitBrah();
        balance -= amount;
    }

    abstract protected boolean canExtract(double amount);

    @Override
    public String toString() {
        return String.format("Balance: %g", balance);
    }
}
