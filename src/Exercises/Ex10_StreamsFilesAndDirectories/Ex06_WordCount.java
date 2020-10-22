package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex06_WordCount {
    public static void main(String[] args) throws IOException {
        Path pathSample = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\words.txt");
        Path pathValidate = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\text.txt");
        PrintWriter printWriter = new PrintWriter("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\" +
                "Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\output_Ex06.txt");
        List<String> samples = Files.readAllLines(pathSample);
        List<String> validations = Files.readAllLines(pathValidate);

        LinkedHashMap<String, Integer> wordsCounter = new LinkedHashMap<>();

        for (String word : samples) {
            for (String validation : validations) {
                String[] lineWords = word.split("\\s+");
                String[] lineValidations = validation.split("\\s+");

                for (int i = 0; i < lineWords.length; i++) {
                    for (int j = 0; j < lineValidations.length; j++) {
                        if (lineWords[i].equalsIgnoreCase(lineValidations[j])) {
                            if (wordsCounter.containsKey(lineWords[i])) {
                                int wordCount = wordsCounter.get(lineWords[i]) + 1;
                                wordsCounter.replace(lineWords[i], wordCount);
                                wordCount = 0;
                            } else {
                                wordsCounter.put(lineWords[i], 1);
                            }
                        }
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> element : wordsCounter.entrySet()) {
            printWriter.printf("%s - %d", element.getKey(), element.getValue());
            printWriter.println();
        }
        printWriter.close();

    }
}
