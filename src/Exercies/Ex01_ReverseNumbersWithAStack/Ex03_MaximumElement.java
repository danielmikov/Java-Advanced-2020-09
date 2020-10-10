package Exercies.Ex01_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCommands = Integer.parseInt(scanner.nextLine());
        Deque<Integer> queue = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nCommands; i++) {
            String commandInput = scanner.nextLine();
            char command = commandInput.charAt(0);
            switch (command) {
                case '1':
                    //System.out.println("command 1");
                    int[] commandAddition = Arrays.stream(commandInput.split(" ")).mapToInt(Integer::parseInt).toArray();
                    queue.push(commandAddition[1]);
                    break;
                case '2':
                    //System.out.println("command 2");
                    if (queue.size() > 0) {
                        queue.pop();
                        max = Integer.MIN_VALUE;
                    }
                    break;
                case '3':
                    //System.out.println("command 3");
                    if (queue.size() == 0) {
                        max = 0;
                    } else {
                        for (int e : queue) {
                            if (max < e) {
                                max = e;
                            }
                        }
                    }
                    System.out.println(max);
                    break;
            }
        }
    }
}
