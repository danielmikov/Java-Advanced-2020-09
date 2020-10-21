package Exercises.Ex08_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean isStopped = false;

        LinkedHashMap<String, Integer> reourcesSet = new LinkedHashMap<>();

        String resource = "";
        int resourceQuantity = 0;

        while (!isStopped) {
            String inputString = scanner.nextLine();

            if (inputString.equals("stop")) {
                isStopped = true;
                break;
            }

            resource = inputString;
            resourceQuantity = Integer.parseInt(scanner.nextLine());

            if (reourcesSet.containsKey(resource)){
                resourceQuantity += reourcesSet.get(resource);
                reourcesSet.put(resource,resourceQuantity);
            } else {
                reourcesSet.put(resource, resourceQuantity);
            }

        }

        for (Map.Entry<String, Integer> resourceEntry : reourcesSet.entrySet()) {
            System.out.printf("%s -> %d", resourceEntry.getKey(), resourceEntry.getValue());
            System.out.println();
        }

    }
}
