package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> cars=new LinkedHashSet<>();

        String input= scanner.nextLine();
        while (!input.equals("END")){

        String[] array =input.split(", ");
        String command=array[0];
        String carNumbers=array[1];
        if (command.equals("IN")){
            cars.add(carNumbers);
        }else {
            cars.remove(carNumbers);
        }

            input= scanner.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
        cars.forEach(System.out::println);

        }
    }
}
