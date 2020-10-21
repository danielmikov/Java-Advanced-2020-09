package Lectures.Lec03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split(" ");
        int hotPotatoIndex = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();
        
        for(String e : kids) {
            kidsQueue.offer(e);
        }
        while (kidsQueue.size()>1){
            for (int i = 0; i < hotPotatoIndex-1; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }
            System.out.println("Removed " + kidsQueue.poll());
        }
        System.out.println("Last is " + kidsQueue.poll());
    }

}
