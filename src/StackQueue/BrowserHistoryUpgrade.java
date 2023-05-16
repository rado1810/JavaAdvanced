package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        ArrayDeque<String> browserHistory=new ArrayDeque<>();
        ArrayDeque<String> forwardHistory=new ArrayDeque<>();
        while (!input.equals("Home")){
            if (input.equals("forward")){
                if (forwardHistory.size()<1){
                    System.out.println("no next URLs");
                    input= scanner.nextLine();
                    continue;
                }
                System.out.println(forwardHistory.peek());
                browserHistory.push(forwardHistory.pop());

            }else if (input.equals("back")){
                if (browserHistory.size()<2){
                    System.out.println("no previous URLs");
                }else {
                    forwardHistory.offer(browserHistory.peek());
                    browserHistory.poll();
                    System.out.println(browserHistory.peek());
                }

            }else {
                System.out.println(input);
                browserHistory.push(input);
                forwardHistory.clear();

            }



            input=scanner.nextLine();
        }
    }
}
