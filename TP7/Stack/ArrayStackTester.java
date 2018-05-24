package TP7.Stack;

public class ArrayStackTester {
    public static void main(String[] args) {
        AccessStack<Integer> stack = new ArrayStack<>();
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.getPushies());
        System.out.println(stack.getPopsies());
    }
}
