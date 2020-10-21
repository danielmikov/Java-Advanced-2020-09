package Lectures.Lec07_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialize set
        Set<String> namesSet = new TreeSet<>();
        namesSet.add("Pesho");

        printStringSet(namesSet);

        //stream set from String

        String input = "15 8 13 9 45 3 18 6 15";

        //HashSet
        Set<Integer> intSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("Set");
        printIntegerSet(intSet);

        //HasSet
        Set<Integer> integerHashSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)   //// int[]
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        Set<Integer> integerHashSet2 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)  /////Integer[]
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("HashSet");
        printIntegerSet(integerHashSet);

        //TreeHashSet
        Set<Integer> integerTreeSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("TreeHashSet");
        printIntegerSet(integerTreeSet);

        //LinkedHashSet
        Set<Integer> intLinkedHasSet = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("LinkedHashSet");
        printIntegerSet(intLinkedHasSet);


        //////////////////
        // Maps

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pesho", 5);
        hashMap.put("Gosho", 2);
        hashMap.put("Lili", 6);
    }

    public static void printStringSet(Set<String> setStrings) {
        setStrings.forEach(System.out::print);
        System.out.println();
    }

    public static void printIntegerSet(Set<Integer> setNumbers) {
        for (int number : setNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printIntegerSetWithHash(Set<Integer> setNumbers) {
        for (int number : setNumbers) {
            System.out.print(number + " ");
            System.out.println(String.valueOf(number).hashCode());
        }
        System.out.println();
    }
}
