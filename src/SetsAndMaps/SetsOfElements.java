package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstFor=arr[0];
        int secondFor=arr[1];
        Set<String>first=new LinkedHashSet<>();
        Set<String>second=new LinkedHashSet<>();

        for (int i = 0; i <firstFor; i++) {
           String num = scanner.nextLine();

            first.add(num);
        }
        for (int i = 0; i <secondFor; i++) {
            String num = scanner.nextLine();

            second.add(num);
        }


       first.retainAll(second);
        String resul = String.join(" ", first);
        System.out.println(resul);


    }
}
