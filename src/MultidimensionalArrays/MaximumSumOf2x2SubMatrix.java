package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows=array[0];
        int colons=array[1];
        int[][]matrix=new int[rows][colons];
        addMatrix(scanner, rows, matrix);
       matrixBestTo2X2SubMatrix(matrix,rows,colons);


    }

    private static void matrixBestTo2X2SubMatrix(int[][] matrix,int row,int colon) {
        int [][]matrix2X2=new   int[2][2];
        int bestSuma=0;
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j <colon -1; j++) {
                int suma =matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1];
                if (suma>bestSuma){
                    bestSuma=suma;
                    matrix2X2[0][0]=matrix[i][j];
                    matrix2X2[0][1]=matrix[i][j+1];
                    matrix2X2[1][0]=matrix[i+1][j];
                    matrix2X2[1][1]=matrix[i+1][j+1];
                }
            }
        }
        for (int[] arr:matrix2X2) {
            for (int e:arr) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println(bestSuma);
    }

    private static void addMatrix(Scanner scanner, int rows, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;

        }
    }
}
