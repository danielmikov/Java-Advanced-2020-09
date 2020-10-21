package Lectures.Lec03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Deque<Integer> binaryNumber = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(number);
        } else {
            while (number > 0) {
                binaryNumber.push(number % 2);
                number /= 2;
            }

            while (binaryNumber.size() > 0) {
                System.out.print(binaryNumber.pop());
            }
        }

    }
}
