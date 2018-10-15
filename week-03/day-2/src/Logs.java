import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
public class Logs {
    public static void main(String[] args) {
        Path myPath = Paths.get("log.txt");
        try {
            List<String> lines = Files.readAllLines(myPath);
            String[][] splitLines = new String[lines.size()][10];
            for (int i = 0; i < lines.size(); i++) {
                splitLines[i] = lines.get(i).split(" ");
            }
            String[] uniqueIPs = uniqueIP(splitLines);
            for (int i = 0; i < uniqueIPs.length; i++) {
                System.out.println(uniqueIPs[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String[] uniqueIP(String[][] log) {
        String uniques = "";
        for (int i = 0; i < log.length; i++) {
            if (!uniques.contains(log[i][8])) {
                uniques += (" " + log[i][8]);
            }
        }
         String[] uniquesArray = new String[log.length];
            uniquesArray = uniques.split(" ");
         return uniquesArray;
    }
}