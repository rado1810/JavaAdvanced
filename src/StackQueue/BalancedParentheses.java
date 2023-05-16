package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split("");
        ArrayDeque<String>stack=new ArrayDeque<>();
        boolean isValid=true;
        if (input.length%2==1){
            isValid=false;
        }else {

        for (int i = 0; i <input.length ; i++) {
            String moment= input[i];
            if (moment.equals("}")){
               String symbol=stack.pop();
               if (symbol.equals("{")){

               }else {
                   isValid=false;
                   break;
               }
            }else if (moment.equals("]")){
                String symbol=stack.pop();
                if (symbol.equals("[")){

                }else {
                    isValid=false;
                    break;
                }
            }else if (moment.equals(")")){
                String symbol=stack.pop();
                if (symbol.equals("(")){

                }else {
                    isValid=false;
                    break;
                }
            }else {
                stack.push(moment);
            }
        }
        }
        if (isValid){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
