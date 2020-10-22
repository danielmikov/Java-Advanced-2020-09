package Lectures.Lec09_StreamsFilesAndDirectorie;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Lecture {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        //----- Create new File -----------
        //File file = new File("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\TextFile.txt");      //path must conatain file name "H:\\TextFile.txt"
        //file.createNewFile();


    }
}
