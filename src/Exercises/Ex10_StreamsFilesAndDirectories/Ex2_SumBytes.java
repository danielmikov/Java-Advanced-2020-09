package Exercises.Ex10_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex2_SumBytes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("H:\\Documents\\SoftUni\\Java Advanced - 2020-09\\src\\Exercises\\Ex10_StreamsFilesAndDirectories\\Resources\\Files_And_Streams\\input.txt");

        long sum = 0;
        for (byte value : Files.readAllBytes(path)) {
            if (value == 10 || value == 13) {
                continue;
            }
            sum += value;
        }
        System.out.println(sum);

    }
}
