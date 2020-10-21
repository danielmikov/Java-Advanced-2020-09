package Exercies.Ex04_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Deque<String> queue = new ArrayDeque<>();

        for (String e : input) {
            queue.push(e);
        }
        for (String e : queue) {
            System.out.print(queue.pop() + " ");
        }

    }
}
