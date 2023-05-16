package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arrNumbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for (int num:arrNumbers) {
            stack.push(num);
        }
        for (Integer num:stack) {
            System.out.print(stack.pop()+" ");
        }
    }
}
