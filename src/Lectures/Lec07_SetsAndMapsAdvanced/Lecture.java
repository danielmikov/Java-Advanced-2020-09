package Lectures.Lec07_SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> strings = new TreeSet<>();

        strings.add("Pesho");
        System.out.println(strings.size());
        strings.add("carcinomas motorists high");
        System.out.println(strings.size());
        strings.add("where inattentive agronomy");
        System.out.println(strings.size());
        strings.add("drumwood boulderhead");
        System.out.println(strings.size());
        strings.add("1");
        System.out.println(strings.size());
        strings.add("drumwood boulderhead");
        System.out.println(strings.size());

        for (String st : strings) {
            System.out.println(st);
        }

        System.out.println();
    }
}
