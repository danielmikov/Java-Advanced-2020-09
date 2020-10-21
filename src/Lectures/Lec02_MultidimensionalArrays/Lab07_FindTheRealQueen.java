package Lectures.Lec02_MultidimensionalArrays;

import java.util.Scanner;

public class Lab07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {
            String[] chars = scanner.nextLine().split("\\s+");
            for (int j = 0; j < chars.length; j++) {
                matrix[i][j] = chars[j].charAt(0);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            //System.out.println();
            breakReturnPoint:
            for (int j = 0; j < matrix[0].length; j++) {
                boolean isTrueQueen = true;
                //System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == 'q') {
                    //System.out.print( "in check %n" );

                    //check row
                    //row right
                    if (j < matrix.length - 1) {
                        for (int right = j + 1; right < matrix.length; right++) {
                            //System.out.println("check right: " + matrix[i][right]);
                            if (matrix[i][right] == 'q') {
                                isTrueQueen = false;
                                //System.out.println("break: " + matrix[i][right]);
                                break breakReturnPoint;
                            }
                        }
                    }

                    //row left
                    if (j > 0) {
                        for (int left = j - 1; left >= 0; left--) {
                            //System.out.println("check left: " + matrix[i][left]);
                            if (matrix[i][left] == 'q') {
                                isTrueQueen = false;
                                //System.out.println("break" + i + " " + j);
                                break breakReturnPoint;
                            }
                        }
                    }

                    //check column
                    //column up
                    if (i < matrix.length - 1) {
                        for (int up = i + 1; up < matrix.length; up++) {
                            //System.out.println("check left: " + matrix[up][j]);
                            if (matrix[up][j] == 'q') {
                                isTrueQueen = false;
                                //System.out.println("break" + i + " " + j);
                                break breakReturnPoint;
                            }
                        }
                    }

                    //column down
                    if (i > 0) {
                        for (int down = i - 1; down >= 0; down--) {
                            if (matrix[down][j] == 'q') {
                                isTrueQueen = false;
                                //System.out.println("break" + i + " " + j);
                                break breakReturnPoint;
                            }
                        }
                    }

                    //check diagonal1
                    //diagonal 1 forward down
                    int indexRows = i;
                    int indexColumns = j;
                    while (indexRows < matrix.length - 1 && indexColumns < matrix.length - 1) {
                        indexRows++;
                        indexColumns++;
                        //System.out.println("d1 forward down: " + matrix[indexRows][indexColumns]);
                        if (matrix[indexRows][indexColumns] == 'q') {
                            isTrueQueen = false;
                            //System.out.println("break" + i + " " + j);
                            break breakReturnPoint;
                        }
                    }
                    //diagonal 1 down
                    indexRows = i;
                    indexColumns = j;

                    while (indexRows > 0 && indexColumns > 0) {
                        indexRows--;
                        indexColumns--;
                        //System.out.println("d1 forward down: " + matrix[indexRows][indexColumns]);
                        if (matrix[indexRows][indexColumns] == 'q') {
                            isTrueQueen = false;
                            //System.out.println("break" + i + " " + j);
                            break breakReturnPoint;
                        }
                    }
                    //check diagonal2
                    //diagonal 2 up
                    indexRows = i;
                    indexColumns = j;
                    while (indexRows < matrix.length - 1 && indexColumns > 0) {
                        indexRows++;
                        indexColumns--;
                        //System.out.println("d1 forward down: " + matrix[indexRows][indexColumns]);
                        if (matrix[indexRows][indexColumns] == 'q') {
                            isTrueQueen = false;
                            //System.out.println("break" + i + " " + j);
                            break breakReturnPoint;
                        }
                    }
                    //diagonal 2 down
                    indexRows = i;
                    indexColumns = j;

                    while (indexRows > 0 && indexColumns < matrix.length - 1) {
                        indexRows--;
                        indexColumns++;
                        //System.out.println("d1 forward down: " + matrix[indexRows][indexColumns]);
                        if (matrix[indexRows][indexColumns] == 'q') {
                            isTrueQueen = false;
                            //System.out.println("break" + i + " " + j);
                            break breakReturnPoint;
                        }
                    }

                    if (isTrueQueen) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
