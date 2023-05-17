package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rotate = scanner.nextLine().replace("(", " ").replace(")", " ").split(" ");
        int rotateNumber = Integer.parseInt(rotate[1]);
        if (rotateNumber > 360) {
            int number = rotateNumber % 360;
            rotateNumber = number;
        }
        String input = scanner.nextLine();
        List<String> word = new ArrayList<>();
        int bestLengthWord = 0;
        while (!input.equals("END")) {
            if (input.length() > bestLengthWord) {
                bestLengthWord = input.length();
            }
            word.add(input);


            input = scanner.nextLine();
        }
        if (rotateNumber == 0) {
            char[][] matrix = rotate0(word);
            printMatrix(matrix);
        } else if (rotateNumber == 90) {

            char[][] matrix = rotate90(word, bestLengthWord);

            printMatrix(matrix);


        } else if (rotateNumber == 180) {
            char[][] matrix = rotate180(word);
            printWithASpace(bestLengthWord, matrix);


        } else if (rotateNumber == 270) {

            char[][] matrix = rotate270(word, bestLengthWord);
            printMatrix(matrix);
        }

    }

    private static char[][] rotate270(List<String> word, int bestLengthWord) {
        int size = word.size();

        char[][] matrix = new char[bestLengthWord][size];

        for (int i = 0; i < size; i++) {
            String reversWord=reversWord(word,i);
            char[] arr = reversWord.toCharArray();
            int sizeWord = arr.length;
            int space = bestLengthWord - sizeWord;
            for (int j = 0; j < space; j++) {

                char ch = (char) 32;
                matrix[j][i] = ch;

            }
            int k=0;
            for (int j = space; j < bestLengthWord; j++) {
                matrix[j][i] = arr[k];
                k++;
            }
        }
        return matrix;
    }

    private static char[][] rotate180(List<String> word) {
        int row = word.size();
        int lastWord = word.size() - 1;
        char[][] matrix = new char[row][];
        for (int i = 0; i < row; i++) {
            String words = reversWord(word, lastWord);
            char[] arr = words.toCharArray();
            matrix[i] = arr;

            lastWord--;
        }
        return matrix;
    }

    private static void printWithASpace(int bestLengthWord, char[][] matrix) {
        for (char[] arr : matrix) {
            if (arr.length!= bestLengthWord){
                int space= bestLengthWord -arr.length;
                for (int i = 0; i <space ; i++) {
                    System.out.print(" ");
                }
            }
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static String reversWord(List<String> word, int letter) {
        String words = word.get(letter);
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        words = String.valueOf(sb);
        return words;
    }

    private static char[][] rotate90(List<String> word, int bestLengthWord) {
        int lastWord = word.size() - 1;
        int size = word.size();

        char[][] matrix = new char[bestLengthWord][size];

        for (int i = 0; i < size; i++) {
            char[] arr = word.get(lastWord).toCharArray();
            int sizeWord = arr.length;
            for (int j = 0; j < sizeWord; j++) {
                matrix[j][i] = arr[j];
            }
            int space = bestLengthWord - sizeWord;
            for (int j = 0; j < space; j++) {

                char ch = (char) 32;
                matrix[sizeWord][i] = ch;
                sizeWord++;
            }
            lastWord--;
        }
        return matrix;
    }

    private static char[][] rotate0(List<String> word) {
        int row = word.size();
        char[][] matrix = new char[row][];

        for (int i = 0; i < row; i++) {
            char[] arr = word.get(i).toCharArray();
            matrix[i] = arr;
        }
        return matrix;

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
