// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String feed = "my-file.txt";
        String copytarget = "my-file_copy.txt";
        try {
            boolean CopySuccess = copyfunction(feed,copytarget);
            if (CopySuccess) {
                System.out.println("Success");
            } else {
                System.out.println("Copy fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static boolean copyfunction(String feeeed, String copy) throws IOException {
        Path path1 = Paths.get(feeeed);
        Path path2 = Paths.get(copy);
        List<String> content = Files.readAllLines(path1);
        Files.write(path2,content);
        // nebo jen jednoduse bez stringu: Files.copy(path1,path1);
        List<String> copied = Files.readAllLines(path2);
        return (content.equals(copied));
        /* v tom returnu je jednoduse napsane toto:
        boolean NECO= (content.equals(copied));
        return NECO;
         */
    }
}