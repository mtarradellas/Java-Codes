package TP5.Bank;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id) {
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return balance > amount;
    }
}
