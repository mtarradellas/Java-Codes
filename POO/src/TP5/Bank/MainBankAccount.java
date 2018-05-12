package TP5.Bank;

public class MainBankAccount {

    public static void main(String[] args) throws IllegalShitBrah {
        CheckingAccount ac = new CheckingAccount(1001, 50);
        ac.deposit(100.0);
        System.out.println(ac);
        ac.extract(150.0);
        System.out.println(ac);
        SavingsAccount ac2 = new SavingsAccount(1002);
        ac2.deposit(100.0);
        System.out.println(ac2);
        ac2.extract(150.0);
    }
}
