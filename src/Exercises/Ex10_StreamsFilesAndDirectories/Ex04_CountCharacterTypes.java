package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        Path pathIn = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\input.txt");

        PrintWriter printWriter = new PrintWriter("H:\\Documents\\SoftUni\\Java Advanced - 2020-09" +
                "\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\output_Ex04.txt");

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;

        for (byte symbol : Files.readAllBytes(pathIn)) {
            if (symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u'){
                vowels++;
            } else if (symbol=='!' ||symbol=='?' ||symbol==',' ||symbol=='.'){
                punctuation++;
            } else if (symbol==' '){
                spaces++;
            }else {
                consonants++;
            }
        }


        //Their solution:
        String charVowels = "aeiou";
        String charPunctuation = "?!,.";
        int vowels2 = 0;
        int consonants2 = 0;
        int punctuation2 = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("H:\\Documents\\SoftUni" +
                "\\Java Advanced - 2020-09\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\" +
                "StreamsFilesDirectories\\input.txt"));
        PrintWriter printWriter2 = new PrintWriter("H:\\Documents\\SoftUni" +
                "\\Java Advanced - 2020-09\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\" +
                "StreamsFilesDirectories\\output_Ex04-02.txt");

        String line = bufferedReader.readLine();
        while (line != null){
            String[] words = line.split("\\s+");
            for (String word : words) {
                for (char symbol : word.toCharArray() ) {
                    String charAsString = String.valueOf(symbol);
                    if (charVowels.contains(charAsString)){
                        vowels2++;
                    } else if (charPunctuation.contains(charAsString)){
                        punctuation2++;
                    } else {
                        consonants2++;
                    }
                }
            }
            line = bufferedReader.readLine();
        }
        printWriter2.println("Vowels " + vowels2);
        printWriter2.println("Consonants " + consonants2);
        printWriter2.println("Punctuation " + punctuation2);
        bufferedReader.close();
        printWriter2.close();

        printWriter.println(String.format("Vowels %d", vowels));
        printWriter.println(String.format("Consonants %d", consonants));
        printWriter.println(String.format("Spaces %d", spaces));
        printWriter.println(String.format("differance %d", consonants-spaces));
        printWriter.println(String.format("Punctuation %d", punctuation));
        printWriter.close();
    }
}
