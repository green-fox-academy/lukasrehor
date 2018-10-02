import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WritingSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        Path myPath = Paths.get("my-file.txt");
        try {
            Files.write(myPath,"Lukas Rehor".getBytes());
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
        /* NEBO:
        List<String> name = new ArrayList();
        name.add("Lukas Rehor");
        try {
            Path myPath = Paths.get("my-file.txt");
            Files.write(myPath, name);
            } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
         */
    }
}