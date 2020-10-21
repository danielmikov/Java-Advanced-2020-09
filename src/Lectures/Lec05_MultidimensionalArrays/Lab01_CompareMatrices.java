package Lectures.Lec05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        scanner.nextLine();

        int[][] matrix1 = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            matrix1[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();

        scanner.nextLine();

        int[][] matrix2 = new int[rows2][columns2];
        for (int row = 0; row < rows2; row++) {
            matrix2[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        boolean isEqual = true;

        if (matrix1.length != matrix2.length) {
            isEqual = false;
        } else if (matrix1[rows - 1].length != matrix2[rows2 - 1].length) {
            isEqual = false;
        } else {

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[rows - 1].length; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        isEqual = false;
                        break;
                    }
                }
            }
        }

        System.out.println(isEqual ? "equal" : "not equal");
    }
}
