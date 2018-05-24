package Taller.Taller10;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SaleUtils {

    public static Map<String, SaleSummary> getSummary(Iterable<Sale> sales) {
        Map<String, SaleSummary> saleSummaryMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        for(Sale sale : sales) {
            if(!saleSummaryMap.containsKey(sale.description)) {
                saleSummaryMap.put(sale.description, new SaleSummary(0,0));
            }
            SaleSummary aux = saleSummaryMap.get(sale.description);
            aux.amount += sale.amount;
            aux.qty += sale.qty;
        }
        return saleSummaryMap;
    }

    protected static class SaleSummary {

        int qty;
        double amount;

        public SaleSummary(int qty, double amount) {
            this.qty = qty;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "SaleSummary{" +
                    "qty=" + qty +
                    ", amount=" + amount +
                    '}';
        }
    }

}
