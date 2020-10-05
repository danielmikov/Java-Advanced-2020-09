package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        while (true) {
            String inputString = scanner.nextLine();

            if (inputString.equals("Home")) {
                break;

            } else if (!inputString.equals("back")) {
                history.push(inputString);
                System.out.println(inputString);

            } else {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");

                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            }
        }
    }
}
