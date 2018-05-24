package Taller.Taller10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SaleTester {

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("item 1", null, 1, 2.5),
                new Sale("Item 2", null, 2,3.0),
                new Sale("item 1", null, 3, 4.5));
        Map<String, SaleUtils.SaleSummary> summaryMap = SaleUtils.getSummary(sales);
        System.out.println(summaryMap);
    }

}
