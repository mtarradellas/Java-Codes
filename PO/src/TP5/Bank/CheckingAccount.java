package TP5.Bank;

public class CheckingAccount extends BankAccount {
    private double overdraft;

    public CheckingAccount(int id, int overdraft) {
        super(id);
        this.overdraft = -overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    protected boolean canExtract(double amount) {
        return (balance - amount) <= overdraft;
    }
}
