package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int matrixRowColon=Integer.parseInt(scanner.nextLine());
        int [][]matrix=new  int[matrixRowColon][matrixRowColon];
        for (int i = 0; i <matrixRowColon ; i++) {
            int []arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
       int sumaFirsDiagonal= sumaFirsDiagonal(matrixRowColon, matrix);
        int sumaSecondDiagonal=sumaSecondDiagonal(matrixRowColon,matrix);
        System.out.println(Math.abs(sumaSecondDiagonal-sumaFirsDiagonal));
    }

    private static int sumaFirsDiagonal(int matrixRowColon, int[][] matrix) {
        int sumaFirsDiagonal=0;
        for (int i = 0; i < matrixRowColon; i++) {
            sumaFirsDiagonal+= matrix[i][i];
        }
        return sumaFirsDiagonal;
    }
    private static int sumaSecondDiagonal(int matrixRowColon, int[][] matrix) {
        int sumaFirsDiagonal=0;
        int colon=matrixRowColon;
        int row=matrixRowColon;
        for (int i = 0; i < colon; i++) {
            row--;
            sumaFirsDiagonal+= matrix[row][i];
        }
        return sumaFirsDiagonal;
    }
}
