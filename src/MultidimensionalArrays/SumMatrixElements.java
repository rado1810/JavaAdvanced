package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] inputArr= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rows=inputArr[0];
        int colons=inputArr[1];
        int[][]matrix=new int[rows][colons];
        extracted(scanner, rows, matrix);
        BestSumaMatrix(rows, colons, matrix);


    }

    private static void BestSumaMatrix(int rows, int colons, int[][] matrix) {
        int bestSuma=0;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < colons ; j++) {
               bestSuma+= matrix[i][j];

            }
        }
        System.out.println(rows);
        System.out.println(colons);
        System.out.println(bestSuma);
    }

    private static void extracted(Scanner scanner, int rows, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            int[]arr=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
    }
}
