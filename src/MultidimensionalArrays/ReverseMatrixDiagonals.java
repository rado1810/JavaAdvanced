package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] matrixRowColon= scanner.nextLine().split(" ");
        int row=Integer.parseInt(matrixRowColon[0]);
        int colon=Integer.parseInt(matrixRowColon[1]);
        if (row==1){
            int []arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = arr.length-1; i >=0 ; i--) {
                int num=arr[i];
                System.out.println(num);
            }
        }else {
        int [][]matrix=new  int[row][colon];

        for (int i = 0; i <row ; i++) {
            int []arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }
       int rows=row-1;
       int colons=colon-1;
       while (rows!=-1){
           int r=rows;
           int c=colons;
           while (c<colon&&r>=0){
               System.out.printf(matrix[r--][c++]+" ");

           }
           System.out.println();
           colons--;
           if (colons==-1){
               colons=0;
               rows--;
           }
       }
        }
    }
}
