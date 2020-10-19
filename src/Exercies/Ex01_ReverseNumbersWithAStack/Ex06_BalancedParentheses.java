package Exercies.Ex01_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex06_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split("");

        if (inputString.length % 2 != 0) {
            System.out.println("NO");
        } else {
            Deque<String> queueLeft = new ArrayDeque<>();
            for (int i = 0; i < inputString.length / 2; i++) {
                queueLeft.push(inputString[i]);
            }

            Deque<String> queueRight = new ArrayDeque<>();
            for (int i = (inputString.length) - 1; i > inputString.length / 2 - 1; i--) {
                queueRight.push(inputString[i]);
            }
            boolean balanced = false;
            for (int i = 0; i < queueLeft.size(); i++) {
                char left = queueLeft.pop().charAt(0);
                int leftSCII = left;
                if (leftSCII== 40){
                    left=41;
                } else if (leftSCII == 91){
                    left=93;
                } else if (leftSCII == 123){
                    left=125;
                }
                char right = queueRight.pop().charAt(0);
                int rightSCII = right; // just for reference

                if (left == right) {
                    balanced = true;
                } else {
                    balanced = false;
                    break;
                }
            }
            System.out.println(balanced ? "YES" : "NO");
        }
    }
}
