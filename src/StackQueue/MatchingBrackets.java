package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        ArrayDeque<Integer>indexOf=new ArrayDeque<>();
        for (int i = 0; i <input.length() ; i++) {
            var momentSymbol= String.valueOf(input.charAt(i));
            if (momentSymbol.equals("(")){
                indexOf.push(i);
            }else if (momentSymbol.equals(")")){
                var endIndex=i;
                var startIndex=indexOf.pop();
                String in=input.substring(startIndex,endIndex+1);
                System.out.println(in);
            }
        }
    }
}
