package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row=arr[0];
        int colon=arr[1];
        String[][] matrix=new String[row][colon];

        for (int i = 0; i <row ; i++) {
           String[] array= scanner.nextLine().split(" ");
            matrix[i]=array;
        }
        String command=scanner.nextLine();
        while (!command.equals("END")){
        String[] swap= command.split(" ");
        if (swap[0].equals("swap")){
            if (swap.length==5){

        int row1= Integer.parseInt(swap[1]);
        int colon1= Integer.parseInt(swap[2]);
        int row2= Integer.parseInt(swap[3]);
        int colon2= Integer.parseInt(swap[4]);
        if (row1>row-1||row2>row-1||colon1>colon-1||colon2>colon-1){
            System.out.println("Invalid input!");
        }else {
        String firstElement=matrix[row1][colon1];
        String secondElement=matrix[row2][colon2];
        matrix[row1][colon1]=secondElement;
        matrix[row2][colon2]=firstElement;
            for (String[]arrs:matrix) {
                for (String c:arrs) {
                    System.out.print(c+" ");
                }
                System.out.println();
            }
        }
            }else {
                System.out.println("Invalid input!");
            }

        }else {
            System.out.println("Invalid input!");
        }




            command= scanner.nextLine();
        }

    }
}
