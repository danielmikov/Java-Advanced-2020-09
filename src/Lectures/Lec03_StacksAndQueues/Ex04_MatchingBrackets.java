package Lectures.Lec03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        Deque<Integer> bracketIndex = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '('){
                bracketIndex.push(i);
            }
            if (ch==')'){
                for (int j = bracketIndex.peek(); j <= i; j++) {
                    char printChar = expression.charAt(j);
                    System.out.print(printChar);
                }
                bracketIndex.pop();
                System.out.println();
            }
        }
    }
}
