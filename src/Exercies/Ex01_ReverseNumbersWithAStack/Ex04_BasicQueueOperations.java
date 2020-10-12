package Exercies.Ex01_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = commands[0]; // N representing the number of elements to enqueue (add)
        int s = commands[1]; // S representing the number of elements to dequeue (remove/poll) from the queue
        int x = commands[2]; // X, an element that you should check whether is present in the queue
        int[] queueContent = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int j : queueContent) queue.offer(j);

        for (int i = 0; i < s; i++) queue.poll();

        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            int min = Integer.MAX_VALUE;
            if (queue.size() == 0) {
                min = 0;
            } else {
                for (int e : queue) {
                    if (min > e) {
                        min = e;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
