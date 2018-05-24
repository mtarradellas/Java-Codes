package TP6.List;

public class LinearListImpTester {
    public static void main(String[] args) {
        LinearListImp<Integer> IntegerList = new LinearListImp<>();
        IntegerList.add(4);
        IntegerList.add(6);
        IntegerList.add(23);
        IntegerList.add(45);
        IntegerList.remove(0);
        IntegerList.remove(2);
        IntegerList.add(344);

        System.out.println(IntegerList);
        System.out.println(IntegerList.size());
        System.out.println(IntegerList.indexOf(344));

    }
}
