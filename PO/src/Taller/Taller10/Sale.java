package Taller.Taller10;

import java.util.Date;

public class Sale {

    String description;
    Date date;
    int qty;
    double amount;

    public Sale(String description, Date date, int qty, double amount) {
        this.description = description;
        this.date = date;
        this.qty = qty;
        this.amount = amount;
    }

}
