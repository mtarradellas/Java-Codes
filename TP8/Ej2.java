package TP8;

import TP6.List.LinearList;
import TP6.List.LinearListImp;

public class Ej2 {
    public static void main(String[] args) {
        LinearList<String> list = new LinearListImp<>();
        list.add("hola");
        list.add("mundo");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
