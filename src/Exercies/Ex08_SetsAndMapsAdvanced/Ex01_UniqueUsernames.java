package Exercies.Ex08_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSize = Integer.parseInt(scanner.nextLine());

        Set<String> namesUnique = new LinkedHashSet<>();

        for (int i = 0; i < inputSize; i++) {
            namesUnique.add(scanner.nextLine());
        }

        namesUnique.forEach(System.out::println);
    }
}
