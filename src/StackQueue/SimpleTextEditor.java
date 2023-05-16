package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        StringBuilder bl=new StringBuilder();
        ArrayDeque<String>stack=new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            String [] input=scanner.nextLine().split(" ");
            var command=input[0];
           if (command.equals("4")){
               var last=stack.pop();
         if (stack.isEmpty()){
             bl= new StringBuilder(last);
         }else {
             bl=new StringBuilder(stack.pop());
         }
         stack.push(last);
           }else if (command.equals("2")){
              var removeElement=bl.length()-Integer.parseInt(input[1]);

           bl.delete(removeElement,bl.length());
            stack.push(String.valueOf(bl));
           }else if (command.equals("3")){
              var   printElement=Integer.parseInt(input[1])-1;
             var symbol = bl.charAt(printElement);
               System.out.println(symbol);
           }else if (command.equals("1")){
               var symbol=input[1];
              bl.append(symbol);
               stack.push(String.valueOf(bl));

           }


        }
    }
}
