package Exercies.Ex04_ReverseNumbersWithAStack;

import java.util.Scanner;

public class Ex07_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fn = Integer.parseInt(scanner.nextLine());

        if (fn == 0) {
            System.out.println(0);
        } else if (fn == 1) {
            System.out.println(1);
        } else {

            double f = ((1 / Math.sqrt(5)) * (Math.pow((2 / (1 - Math.sqrt(5))), fn + 1)))
                    - ((1 / Math.sqrt(5)) * (Math.pow((2 / (1 + Math.sqrt(5))), fn + 1)));

            int fibonacci = (int)Math.ceil(Math.abs(f));
            System.out.println(fibonacci);
        }


    }
}
