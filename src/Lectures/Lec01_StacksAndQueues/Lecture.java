package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
 Last In First Out (LIFO) --- used as stack
        stack.push(0);
        stack.peek();
        stack.pop();
        */

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack);



        /*
////First In First Out (FIFO) --- used as queue
        queue.add(0);
        queue.offer(0);
        queue.remove();
        queue.poll();
        */

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(0); //add index[last+1]
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        queue.offer(4);
        System.out.println(queue.size());
        System.out.println(queue);

        // mix stak and queue...

        Deque<Integer> mix01 = new ArrayDeque<>();
        mix01.offer(11);
        mix01.push(22);
        mix01.offer(33);
        mix01.push(88); // last input dictates behavior //as stack

        System.out.println(mix01);
        System.out.println(mix01.peek());

        Deque<Integer> mix02 = new ArrayDeque<>();
        mix02.push(11);
        mix02.offer(22);
        mix02.push(33);
        mix02.offer(88); // last input dictates behavior //as queue

        System.out.println(mix02);
        System.out.println(mix02.peek());

        System.out.println();

        boolean isTrue = false;
        if (scanner.nextLine().equals("1")){
            isTrue = true;
        }
        // easy boolean
        System.out.println(isTrue ? "true" : "false");
    }
}