package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split(", ");
        int matrixSize=Integer.parseInt(input[0]);
        String methods=input[1];
        int[][] matrix=new  int[matrixSize][matrixSize];
        if (methods.equals("A")){
             matrix=methodA(methods,matrixSize);
            System.out.println();
        }else {
           matrix =methodB(methods,matrixSize);

        }
        print(matrix);


    }
    public static int[][] methodA(String methods, int size){
        int number=1;
        int[][] matrix=new int[size][size];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[j][i]=number++;
            }
        }
        return matrix;
    }
    public static int[][] methodB(String methods, int size){
        int number=1;
        int[][] matrix=new int[size][size];
        for (int i = 0; i < matrix.length ; i++) {
            if (i%2==0){
            for (int j = 0; j < matrix.length ; j++) {
                matrix[j][i]=number++;
            }

            }else {
                for (int j = matrix.length-1; j >=0 ; j--) {
                    matrix[j][i]=number++;
                }
            }
        }
        return matrix;
    }
    public static void print(int [][]matrix){
        for (int []arr:matrix) {
            for (int num:arr) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
