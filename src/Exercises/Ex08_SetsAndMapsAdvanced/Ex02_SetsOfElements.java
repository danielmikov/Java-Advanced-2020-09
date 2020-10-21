package Exercises.Ex08_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int set1Size = scanner.nextInt();
        int set2Size = scanner.nextInt();
        scanner.nextLine();

        LinkedHashSet<Integer> set1= new LinkedHashSet<>();
        LinkedHashSet<Integer> set2= new LinkedHashSet<>();
        populateSetFromScanner(scanner, set1Size, set1);
        populateSetFromScanner(scanner, set2Size, set2);

        // should have used set1.retainAll(set2); print set1;
        if (set1Size>set2Size){
            for (int element : set2) {
                if (set1.contains(element)){
                    System.out.print(element + " ");
                }
            }
        } else {
            for (int element : set1) {
                if (set2.contains(element)){
                    System.out.print(element + " ");
                }
            }
        }

    }

    public static LinkedHashSet<Integer> populateSetFromScanner(Scanner scanner, int setSize, LinkedHashSet<Integer> set) {
        for (int i = 0; i < setSize; i++) {
            set.add(Integer.parseInt(scanner.nextLine()));
        }
        return set;
    }
}
