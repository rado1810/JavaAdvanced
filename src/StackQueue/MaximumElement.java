package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String input= scanner.nextLine();
            if (input.equals("2")){
                stack.pop();

            }else if (input.equals("3")){
                int maximumNumber=Integer.MIN_VALUE;

                for (Integer num:stack) {
                     if (maximumNumber<num){
                         maximumNumber=num;
                     }

                }
                System.out.println(maximumNumber);
            }else {
                String [] commandAndNumber=input.split(" ");
                int number= Integer.parseInt(commandAndNumber[1]);
                stack.push(number);
            }
        }

    }
}
