package MultidimensionalArrays;


import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = getInts(scanner);
        int rows=arr[0];
        int colons=arr[1];
        int[][] matrix=new int[rows][colons];
        addMatrix(scanner, rows, matrix);
        int[]arr1=getInts(scanner);
        int rows1=arr1[0];
        int colons1=arr1[1];
        int[][] matrix1=new int[rows1][colons1];
        addMatrix(scanner, rows1, matrix1);

    }

    private static int[] getInts(Scanner scanner) {
        int [] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        return arr;
    }

    private static void addMatrix(Scanner scanner, int rows, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int[] arrs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
          matrix[row]=arrs;
        }
    }
  /*  private static boolean isEqual(int[][] matrix,int[][] matrix1,boolean isValid){
        if (matrix.length!=matrix1.length){
            return false;
        }
       for (int row = 0; row <matrix.length ; row++) {

            for (int colon = 0; colon <matrix[row].length ; colon++) {

            }
        }
    }
   */
}

