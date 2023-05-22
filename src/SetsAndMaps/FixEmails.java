package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        var input=scanner.nextLine();
        LinkedHashMap<String,String>fixEmails=new LinkedHashMap<>();
        while (!input.equals("stop")){
      var name=input;
      var email=scanner.nextLine();
      if (!(email.contains(".us")||email.contains(".com")||email.contains(".uk"))){
          fixEmails.putIfAbsent(name,email);
      }


            input= scanner.nextLine();
        }
        fixEmails.forEach((k,v)->{
            System.out.printf("%s -> %s\n",k,v);
        });
    }
}
