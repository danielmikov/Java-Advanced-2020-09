package Exercies.Ex08_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loadingInventory = true;
        TreeMap<String, String> phonebook = new TreeMap<>();

        while (loadingInventory) {
            String inputString = scanner.nextLine();

            if (inputString.equals("search")) {
                loadingInventory = false;
                break;
            }

            String[] entry = inputString.split("-");
            phonebook.put(entry[0], entry[1]);


        }

        boolean searching = true;
        while (searching) {
            String nameSearch = scanner.nextLine();
            if (nameSearch.equals("stop")) {
                searching = false;
                break;
            }
            if (phonebook.containsKey(nameSearch)) {
                System.out.printf("%s -> %s", nameSearch, phonebook.get(nameSearch));
                System.out.println();
            } else {
                System.out.printf("Contact %s does not exist.", nameSearch);
                System.out.println();
            }

        }
    }
}
