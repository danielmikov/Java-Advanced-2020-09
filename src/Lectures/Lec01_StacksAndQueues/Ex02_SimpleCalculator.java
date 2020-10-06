package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");
        Deque<Integer> sum = new ArrayDeque<>();
        sum.push(0);
        boolean add = true;

        for (String s : inputString) {
            if (s.equals("+")) {
                add = true;

            } else if (s.equals("-")) {
                add = false;

            } else {
                if (add) {
                    sum.push(sum.pop() + Integer.parseInt(s));
                } else {
                    sum.push(sum.pop() - Integer.parseInt(s));
                }
            }
        }
        System.out.println(sum.peek());

    }
}
