package SetsAndMaps;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] input= scanner.nextLine().toCharArray();
        TreeMap<Character,Integer>countSymbols=new TreeMap<>();
        for (char c:input) {
            countSymbols.putIfAbsent(c,0);
            if (countSymbols.containsKey(c)){
                countSymbols.put(c,countSymbols.get(c)+1);
            }
        }
        countSymbols.forEach((k,v)->{
            System.out.printf("%c: %d time/s\n",k,v);
        });

    }
}
