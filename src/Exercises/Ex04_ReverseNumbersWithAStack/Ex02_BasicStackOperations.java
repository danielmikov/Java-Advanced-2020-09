package Exercises.Ex04_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] instructions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = instructions[0]; // number of elements to push onto the stack
        int s = instructions[1]; // representing the number of elements to pop from the stack
        int x = instructions[2]; // an element that you should check whether is present in the stack

        int[] stackElements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> queue = new ArrayDeque<>();
        int smallest = Integer.MAX_VALUE;

        for (int e : stackElements) {
            queue.push(e);
            if (smallest > e) {
                smallest = e;
            }
        }

        for (int i = 0; i < s; i++) {
            queue.pop();
        }

        if (queue.contains(x)){
            System.out.println("true");
        } else if (queue.size()==0){
            System.out.println(0);
        } else {
            for (int e : queue) {
                if (smallest > e) {
                    smallest = e;
                }
            }
            System.out.println(smallest);
        }
    }
}
