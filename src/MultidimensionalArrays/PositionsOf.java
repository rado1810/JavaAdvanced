package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int rows = numbers[0];
        int colon = numbers[1];
        int[][] arr = new int[rows][colon];
        for (int row = 0; row < rows; row++) {
            int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            arr[row] = numbersArr;
        }
        int isNumber = Integer.parseInt(scanner.nextLine());

        extracted(arr, isNumber);


    }

    private static void extracted(int[][] arr, int isNumber) {
        boolean isValid = false;
        for (int row = 0; row < arr.length; row++) {
            for (int colons = 0; colons < arr[row].length; colons++) {
                int momentNumber = arr[row][colons];
                if (momentNumber == isNumber) {
                    System.out.println(row + " " + colons);
                    isValid = true;
                }
            }

        }
        if (!isValid) {
            System.out.println("not found");
        }

    }
}
