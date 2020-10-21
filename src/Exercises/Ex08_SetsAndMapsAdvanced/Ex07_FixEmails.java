package Exercises.Ex08_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean gettingContacts = true;
        LinkedHashMap<String, String> contactBook = new LinkedHashMap<>();

        while (gettingContacts) {
            String inputString = scanner.nextLine();

            if (inputString.equals("stop")) {
                gettingContacts = false;
                break;
            }
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                contactBook.put(inputString, email);
            }
        }

        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}
