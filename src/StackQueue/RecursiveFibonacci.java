package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long>stack=new ArrayDeque<>();
        stack.push(1L);
        stack.push(1L);
        for (int i = 2; i <=n ; i++) {
            long monet=stack.pop();
            long moment1=stack.peek();
           long suma=monet+moment1;
            stack.push(monet);
            stack.push(suma);
        }
        System.out.println(stack.peek());
    }
}
