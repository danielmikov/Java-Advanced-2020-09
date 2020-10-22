package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex01_SumLines {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories\\input.txt");

        List<String> lines = Files.readAllLines(path);

        lines.stream().map(String::chars);

        int sum = 0;

        for (int line = 0; line < lines.size(); line++) {
            for (int word = 0; word < lines.get(line).length(); word++) {
                sum += lines.get(line).charAt(word);
            }
            System.out.println(sum);
            sum = 0;
        }
/*
        Their solution:

        List<String> lines1 = Files.readAllLines(path);
        lines1.stream().map(String::toCharArray).forEach(charArray ->
                {
                    int sum1 = 0;
                    for (char symbol : charArray) {
                        sum1 += symbol;
                    }
                    System.out.println(sum1);
                }
        );
*/
    }
}
