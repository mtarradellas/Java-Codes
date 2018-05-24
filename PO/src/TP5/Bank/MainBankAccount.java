package TP5.Bank;

public class MainBankAccount {

    public static void main(String[] args) {
        CheckingAccount ac = new CheckingAccount(1001, 50);
        ac.deposit(100.0);
        System.out.println(ac);
        try {
            ac.extract(150.0);
        }   catch (IllegalShitBrah e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ac);
        SavingsAccount ac2 = new SavingsAccount(1002);
        ac2.deposit(100.0);
        System.out.println(ac2);
        try {
            ac2.extract(150.0);
        } catch (IllegalShitBrah e) {
            System.out.println(e.getMessage());
        }
    }
}
