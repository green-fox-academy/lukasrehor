// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        Path myPath = Paths.get("file.txt");
        System.out.println(CountAllLines(myPath));
    }
    private static int CountAllLines(Path myPath) {
        try {
            List<String> lines = Files.readAllLines(myPath);
            return lines.size();
        } catch (IOException e) {
            System.out.print("Can not read file - ");
            return 0;
        }
    }
}
/*  Another way:

    public static void main(String[] args) {
        System.out.println(countLines("file.txt"));
    }

    public static int countLines(String filename) {
        try {
            Path myPath = Paths.get(filename);
            List<String> lines = Files.readAllLines(myPath);
            return lines.size();
        } catch (IOException e) {
            System.out.print("Can not read file - ");
            return 0;
        }
    }
*/