package Exercises.Ex12_DefiningClasses.Ex01_OpinionPoll;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nEntries = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Integer> peopleList = new TreeMap<>();

        for (int i = 0; i < nEntries; i++) {
            String[] personEntry = scanner.nextLine().split("\\s+");
            Person person = new Person(personEntry[0], Integer.parseInt(personEntry[1]));

            if (person.getAge() > 30) {
                peopleList.put(person.getName(), person.getAge());
            }

        }

        for (Map.Entry<String,Integer> entry : peopleList.entrySet()) {
            System.out.println(String.format("%s - %d",entry.getKey(),entry.getValue()));
        }

    }
}
