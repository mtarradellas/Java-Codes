package TP8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(10);
        list.add(8);
        list.add(17);
        Predicate<Integer> pair = i -> i%2 == 0;
        list.removeIf(pair);
        for (Integer n: list) {
            System.out.print(n + " ");
        }
    }
}
