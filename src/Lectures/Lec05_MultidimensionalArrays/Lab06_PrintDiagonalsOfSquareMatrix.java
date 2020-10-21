package Lectures.Lec05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareSize = Integer.parseInt(scanner.nextLine());
        int[][] square = new int[squareSize][squareSize];

        for (int i = 0; i < squareSize; i++) {
            square[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int indexRows = 0;
        int indexColumns = 0;
        for (int i = 0; i < squareSize; i++) {
            System.out.print(square[indexRows++][indexColumns++] + " ");
        }
        System.out.println();

        indexRows = squareSize-1;
        indexColumns = 0;
        for (int i = 0; i < squareSize; i++) {
            System.out.print(square[indexRows--][indexColumns++] + " ");
        }
        System.out.println();
    }
}
