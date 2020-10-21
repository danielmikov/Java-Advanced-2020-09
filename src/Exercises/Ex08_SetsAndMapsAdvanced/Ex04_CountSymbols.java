package Exercises.Ex08_SetsAndMapsAdvanced;

import java.util.*;

public class Ex04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<Character, Integer> charSetUsed = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char charCurrent = input.charAt(i);

            if (!charSetUsed.containsKey(charCurrent)){
                charSetUsed.put(charCurrent, 1);
            } else {
                int currentCount = charSetUsed.get(charCurrent);
                charSetUsed.put(charCurrent, ++currentCount);
            }
        }

        for (Map.Entry<Character, Integer> entry : charSetUsed.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
