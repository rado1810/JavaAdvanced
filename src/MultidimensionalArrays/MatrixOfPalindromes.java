package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row=arr[0];
        int colon=arr[1];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <colon ; j++) {
                int number=97+i;
                char firstAndLast=(char) number;
                int mudNumber=number+j;
                char midSymbol= (char) mudNumber;
                System.out.print(firstAndLast);
                System.out.print(midSymbol);
                System.out.print(firstAndLast);
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
