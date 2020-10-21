package Exercises.Ex08_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nChemicals = Integer.parseInt(scanner.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < nChemicals; i++) {
            String[] chemical = scanner.nextLine().split("\\s+");
            for (String element : chemical) {
                elements.add(element);
            }
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
