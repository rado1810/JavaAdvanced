package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] input= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int pushElement=input[0];
        int pollElement=input[1];
        int wantedItem=input[2];
        if (pushElement==pollElement){
            System.out.println(0);
        }else {
        int [] number= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        ArrayDeque<Integer>stack=new ArrayDeque<>();

        for (int i = 0; i <pushElement ; i++) {
            stack.push(number[i]);
        }

        boolean matchingTheSearchedNumber=false;
        for (int i = 0; i <pollElement ; i++) {
            int num= stack.pop();
        }
            for (Integer num:stack) {
                if (num==wantedItem){
                    matchingTheSearchedNumber=true;
                }
            }
        if (matchingTheSearchedNumber){
            System.out.println("true");
        }else {
            int minNumber=Integer.MAX_VALUE;
            for (Integer num:stack) {
                if (num<=minNumber){
                    minNumber=num;
                }
            }
            System.out.println(minNumber);
        }
        }

    }
}
