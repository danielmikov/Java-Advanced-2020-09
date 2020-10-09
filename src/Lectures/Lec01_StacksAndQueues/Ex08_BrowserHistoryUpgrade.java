package Lectures.Lec01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean browsing=true;
        Deque<String> browsingBack = new ArrayDeque<>();
        Deque<String> browsingForward = new ArrayDeque<>();

        while (browsing){
            String input = scanner.nextLine();

            switch (input) {
                case "home", "Home":
                    browsing = false;
                    break;
                case "back", "Back":
                    if (browsingBack.size()<=1){
                        System.out.println("no previous URLs");
                    } else {
                        browsingForward.offer(browsingBack.poll());
                        System.out.println(browsingBack.peek());
                    }
                    break;
                case "forward", "Forward":
                    if (browsingForward.isEmpty()){
                        System.out.println("no next URLs");
                    } else {
                        System.out.println(browsingForward.peek());
                        browsingBack.push(browsingForward.poll());
                    }
                    break;
                default:
                    browsingBack.push(input);
                    System.out.println(input);
                    break;

            }
        }
    }
}
