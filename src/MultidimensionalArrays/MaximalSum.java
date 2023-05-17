package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row=arr[0];
        int colon=arr[1];
        int[][] matrix=new  int[row][colon];
        for (int i = 0; i <row ; i++) {
            int[]array= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=array;
        }
        int [][] matrix3X3=new  int[3][3];
                int sumaBest=0;
        for (int i = 0; i <row-2 ; i++) {
            for (int j = 0; j <colon-2 ; j++) {

                        int suma=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+
                                matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                        if (suma>sumaBest){
                            sumaBest=suma;
                            matrix3X3[0][0]=matrix[i][j];
                            matrix3X3[0][1]=matrix[i][j+1];
                            matrix3X3[0][2]=matrix[i][j+2];
                            matrix3X3[1][0]=matrix[i+1][j];
                            matrix3X3[1][1]=matrix[i+1][j+1];
                            matrix3X3[1][2]=matrix[i+1][j+2];
                            matrix3X3[2][0]=matrix[i+2][j];
                            matrix3X3[2][1]=matrix[i+2][j+1];
                            matrix3X3[2][2]=matrix[i+2][j+2];
                        }


            }
        }
        System.out.printf("Sum = %d%n",sumaBest);
        for (int[]element:matrix3X3) {
            for (int number:element) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
