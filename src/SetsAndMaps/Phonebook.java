package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String,String>phonebook=new LinkedHashMap<>();
        while (!input.equals("search")){
            String[] tokens = input.split("-");
            var name=tokens[0];
            var number=tokens[1];
            phonebook.putIfAbsent(name,number);

            input= scanner.nextLine();
        }
        input= scanner.nextLine();
        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.printf("%s -> %s\n",input,phonebook.get(input));
            }else {
                System.out.printf("Contact %s does not exist.\n",input);
            }

            input= scanner.nextLine();
        }
    }
}
