package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=Integer.parseInt(scanner.nextLine());
        int colon=row;
        int[][]matrix=new int[row][colon];
        for (int i = 0; i <row ; i++) {
            int []arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
        printFromUptoDownDiagonal(row, matrix);
        System.out.println();

        printFromDownToUpDiagonal(row, colon, matrix);
    }

    private static void printFromDownToUpDiagonal(int row, int colon, int[][] matrix) {
        for (int i = 0; i < colon; i++) {
            row--;
            System.out.print(matrix[row][i]+" ");
        }
    }

    private static void printFromUptoDownDiagonal(int row, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            System.out.print(matrix[i][i]+" ");
        }
    }
}
