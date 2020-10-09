package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean printing = true;
        Deque<String> queueJobs = new ArrayDeque<>();
        Deque<String> queuePrint = new ArrayDeque<>();

        while (printing) {
            String input = scanner.nextLine();

            switch (input) {
                case "print":
                    //print queue
                    printing = false;
                    for(String s : queuePrint) {
                        System.out.println(s);
                    }
                    for (String s: queueJobs) {
                        System.out.println(s);
                    }
                    break;

                case "cancel":
                    //remove first in queue
                    if (queueJobs.size() == 0) {
                        queuePrint.offer("Printer is on standby");
                    } else {
                        queuePrint.offer("Canceled " + queueJobs.poll());
                    }
                    break;
                default:
                    //add to queue
                    queueJobs.offer(input);
                    break;
            }
        }
    }
}