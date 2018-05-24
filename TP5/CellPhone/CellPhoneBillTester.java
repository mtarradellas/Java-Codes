package TP5.CellPhone;

public class CellPhoneBillTester {

    public static void main(String[] args) {
        FriendsCellPhoneBill my_bill = new FriendsCellPhoneBill("4444-4444", 3, 98);
        my_bill.setDiscount(98);
        try {
            my_bill.addFriend("5555-5555");
            my_bill.addFriend("6666-6666");
        } catch (RuntimeException ex) {
// No ocurre
        }
        my_bill.registerCall("5555-5555", 10);
        my_bill.registerCall("6666-5555", 10);
        System.out.println(my_bill.processBill());
        try {
            my_bill.addFriend("6666-6666");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());

            try {
                my_bill.addFriend("4444-4444");
                my_bill.addFriend("7777-7777");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());

                try {
                    my_bill.removeFriend("5555-5555");
                    my_bill.removeFriend("5555-5555");
                } catch (RuntimeException ee) {
                    System.out.println(ee.getMessage());
                }
            }
        }
    }
}
