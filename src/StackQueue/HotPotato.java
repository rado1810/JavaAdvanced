package StackQueue;

import java.util.*;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String>input= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int number=Integer.parseInt(scanner.nextLine());
        ArrayDeque<String>queue=new ArrayDeque<>();
        for (String input1:input) {
           queue.offer(input1);
        }


       while (queue.size()>1){
           for (int i =1 ; i <number ; i++) {
               queue.offer(queue.pop());
           }
           System.out.println("Removed "+queue.poll());
       }
        System.out.println("Last is "+queue.poll());
    }
}
