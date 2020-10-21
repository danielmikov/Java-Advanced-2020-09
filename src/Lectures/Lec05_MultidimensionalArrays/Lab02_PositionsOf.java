package Lectures.Lec05_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        boolean xIsPresent = false;
        int x = Integer.parseInt(scanner.nextLine()); //find x in Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int currentNumber = matrix[i][j];
                if (currentNumber==x){
                    xIsPresent = true;
                    System.out.println(i + " " + j);
                }
            }
        }

        if (!xIsPresent){
            System.out.println("not found");
        }

    }
}
