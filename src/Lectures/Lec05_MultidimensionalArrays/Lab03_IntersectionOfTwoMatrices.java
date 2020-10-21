package Lectures.Lec05_MultidimensionalArrays;

import java.util.Scanner;

public class Lab03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer sizeRows = Integer.parseInt(scanner.nextLine());
        Integer sizeColumns = Integer.parseInt(scanner.nextLine());

        char[][] matrixFirst = getCharMatrix(scanner, sizeRows, sizeColumns);
        char[][] matrixSecond = getCharMatrix(scanner, sizeRows, sizeColumns);

        char[][] output = compareMatrixes(sizeRows, sizeColumns, matrixFirst, matrixSecond);

        printResult(sizeRows, sizeColumns, output);

    }

    public static void printResult(Integer sizeRows, Integer sizeColumns, char[][] output) {
        for (int i = 0; i < sizeRows; i++) {
            for (int j = 0; j < sizeColumns; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] compareMatrixes(Integer sizeRows, Integer sizeColumns, char[][] matrixFirst, char[][] matrixSecond) {
        char[][] chars = new char[sizeRows][sizeColumns];
        for (int i = 0; i < sizeRows; i++) {
            for (int j = 0; j < sizeColumns; j++) {
                chars[i][j] =
                        matrixFirst[i][j] == matrixSecond[i][j] ? matrixFirst[i][j] : '*';
            }
        }
        return chars;
    }

    public static char[][] getCharMatrix(Scanner scanner, Integer sizeRows, Integer sizeColumns) {
        char[][] matrix = new char[sizeRows][sizeColumns];
        for (int i = 0; i < sizeRows; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int j = 0; j < sizeColumns; j++) {
                matrix[i][j] = line[j].charAt(0);
            }
        }
        return matrix;
    }
}
