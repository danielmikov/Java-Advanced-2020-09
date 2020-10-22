package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex05_LineNumbers {
    public static void main(String[] args) throws IOException {
        Path pathIn = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises" +
                "\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\inputLineNumbers.txt");
        PrintWriter printWriter= new PrintWriter("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\" +
                "Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\StreamsFilesDirectories" +
                "\\output_Ex05.txt");
        List<String> lines = Files.readAllLines(pathIn);
        int lineNumber = 0 ;
        for (String line : lines) {
            printWriter.printf("%d. %s", ++lineNumber, line);
            printWriter.println();
        }
        printWriter.close();
    }
}
