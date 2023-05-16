package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=Integer.parseInt(scanner.nextLine());
        int colons=Integer.parseInt(scanner.nextLine());
        String[][]matrix =new String[rows][colons];
        String[][]matrix1 =new String[rows][colons];
        extracted(scanner, rows, matrix);
        extracted(scanner, rows, matrix1);
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <colons ; j++) {
                if (matrix[i][j].equals(matrix1[i][j])){
                    System.out.print(matrix[i][j]+" ");
                }else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }

    private static void extracted(Scanner scanner, int rows, String[][] matrix) {
        for (int i = 0; i < rows; i++) {
            String[] matrixs = scanner.nextLine().split(" ");
            matrix[i]=matrixs;
        }
    }
}
