import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        try {
            Path myPath = Paths.get("my-file.txt");
            List<String>content = Files.readAllLines(myPath);
            for (String lines : content) {
                System.out.println(lines);
            }

            /*  to for... nahore je jina verze tohoto:
            for (int i = 0; i < content.size(); i++) {
                System.out.println(content.get(i));
            } */

        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}