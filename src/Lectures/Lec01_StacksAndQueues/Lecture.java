package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
//add element to stock
        deque.push(14);
        deque.push(51);
        deque.push(81);
//delete element (last in)
        deque.pop();
//check element (last in)
        deque.peek();
    }
}
