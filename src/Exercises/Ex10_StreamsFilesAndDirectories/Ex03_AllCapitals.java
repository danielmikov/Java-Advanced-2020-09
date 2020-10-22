package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex03_AllCapitals {
    public static void main(String[] args) throws IOException {
        Path pathIn = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories\\input.txt");

        List<String> lines = Files.readAllLines(pathIn);

        PrintWriter printWriter = new PrintWriter("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src" +
                "\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories\\output_Ex03.txt");
        lines.forEach( line -> printWriter.println(line.toUpperCase()));
        printWriter.close();
    }
}
