package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]arr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer>countNumbers=new LinkedHashMap<>();
        for (double a:arr) {
            countNumbers.putIfAbsent(a,0);
            if (countNumbers.containsKey(a)){
                countNumbers.put(a,countNumbers.get(a)+1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbers.entrySet()) {
            System.out.printf("%.1f -> %d\n",entry.getKey(),entry.getValue());
        }


    }
}
