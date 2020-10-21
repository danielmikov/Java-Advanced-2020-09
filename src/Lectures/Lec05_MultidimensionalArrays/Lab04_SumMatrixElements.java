package Lectures.Lec05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int sizeRows = dimensions[0];
        int sizeColumns = dimensions[1];

        int[][] matrix = new int[sizeRows][sizeColumns];

        for (int i = 0; i < sizeRows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = 0;
        int rows = 0;
        int columns = 0;
        for (int i = 0; i < sizeRows; i++) {
            rows++;
            for (int j = 0; j < sizeColumns; j++) {
                columns++;
                sum += matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(columns/rows);
        System.out.println(sum);

    }
}
