import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
public class WritingMultipleLines {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Path myPath = Paths.get("my-file.txt");
        System.out.println("Enter a number of lines:");
        int lines = scan.nextInt();
        System.out.println("Enter a word:");
        String word = scan.next();
        try {
            writefile(myPath, word, lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void writefile(Path thePath, String theword, int numLines) throws IOException {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            newList.add(theword);
        }
        Files.write(thePath, newList);
    }
}