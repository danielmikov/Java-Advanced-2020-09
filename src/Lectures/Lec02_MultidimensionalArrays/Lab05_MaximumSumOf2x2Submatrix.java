package Lectures.Lec02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[matrixSize[0]][matrixSize[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int sumBiggest = Integer.MIN_VALUE;
        int[][] matrixBiggest = new int[2][2];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sumCurrent = 0;
        for (int i = 0; i < matrixSize[0] - 1; i++) {
            for (int j = 0; j < matrixSize[1] - 1; j++) {
                num1 = matrix[i][j];
                num2 = matrix[i][j + 1];
                num3 = matrix[i + 1][j];
                num4 = matrix[i + 1][j + 1];

                sumCurrent = num1 + num2 + num3 + num4;

                if (sumCurrent >= sumBiggest) {
                    sumBiggest = sumCurrent;
                    matrixBiggest[0][0] = num1;
                    matrixBiggest[0][1] = num2;
                    matrixBiggest[1][0] = num3;
                    matrixBiggest[1][1] = num4;
                }
            }
        }

        System.out.println(matrixBiggest[0][0] + " " + matrixBiggest[0][1]);
        System.out.println(matrixBiggest[1][0] + " " + matrixBiggest[1][1]);
        System.out.println(sumBiggest);


    }
}
