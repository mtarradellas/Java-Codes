package TP5.CellPhone;

import java.util.Arrays;

public class FriendsCellPhoneBill extends CellPhoneBill {
    private String[] friends;
    private int fDim;
    private int fAmount;
    private double discount;

    public FriendsCellPhoneBill(String number, int friendsAmount, int discount) {
        super(number);
        if(friendsAmount < 0)
            throw new RuntimeException("Friends amount must be positive");
        fAmount = friendsAmount;
        friends = new String[fAmount];
        fDim = 0;
        setDiscount(discount);
    }

    public void setDiscount(double discount) {
        if(discount < 0)
            throw new RuntimeException("Discount must be positive");
        this.discount = discount;
    }

    public void addFriend(String number) {
        if (fDim == fAmount)
            throw new RuntimeException("No more friends space");
        if (findFriend(number) != -1)
            throw new RuntimeException("Number already friend");
        friends[fDim++] = number;
    }

    public void removeFriend(String number) {
        int f = findFriend(number);
        if ( f < 0 ) {
            throw new RuntimeException("Number is not a friend");
        }
        else remove(f);
    }

    private int findFriend(String number) {
        for (int i = 0; i<fDim; i++) {
            if (friends[i].equals(number))
                return i;
        }
        return -1;
    }

    private void remove(int idx) {
        for (int i = idx+1; i<fDim; i++) {
            friends[i-1] = friends[i];
        }
        fDim--;
    }

    @Override
    public double processBill() {
        double bill = 0;
        for(int i = 0; i<dim; i++){
            bill += (getCost(calls[i]));
        }
        return bill;
    }

    private double getCost(Call call) {
        if (findFriend(call.getTo()) < 0)
            return call.cost();
        return call.cost()*discount;
    }
}
