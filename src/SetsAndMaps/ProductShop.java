package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String,Double>>companies=new TreeMap<>();
        while (!input.equals("Revision")){
            String[] arr = input.split(", ");
            String shop = arr[0];
            String products = arr[1];
            double price = Double.parseDouble(arr[2]);
            companies.putIfAbsent(shop,new LinkedHashMap<>());
            if (companies.containsKey(shop)){
                companies.get(shop).put(products,price);
            }

            input= scanner.nextLine();
        }
        companies.forEach((shop,product)->{
            System.out.println(shop+"->");
            product.forEach((key,price)->{
                System.out.printf("Product: %s, Price: %.1f\n",key,price);
            });


        });
    }
}
