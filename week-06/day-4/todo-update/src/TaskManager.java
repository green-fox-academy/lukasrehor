import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TaskManager {

    private static List<Task> taskList = new ArrayList<>();
    private static int id = 0;
    private static Path myPath = Paths.get("data.txt");

    static void fillList (){
        try {
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                String[] split = lines.get(i).split(";");
                if (split[0].equals("0")) {
                    addTaskFromFileToList(false,Integer.parseInt(split[1]),split[2],split[3],null);
                } else {
                    addTaskFromFileToList(true,Integer.parseInt(split[1]),split[2],split[3],split[4]);
                }
                id = lines.size();
                if (Integer.parseInt(split[1]) > lines.size()) {
                   id = Integer.parseInt(split[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addTaskFromFileToList(boolean completed, int id, String description, String createdAt, String completedAt) {
        taskList.add(new Task(completed, id, description, createdAt, completedAt));
    }

    static void listTasks () {
        if (taskList.isEmpty()) {
            System.out.println("No todos for today! :)");
        } else for (Task i : taskList) {
            System.out.println(i.toStringg());
        }
    }

    static void addTask (String description) {
        id++;
        taskList.add(new Task(false, id, description, String.valueOf(LocalDateTime.now(Clock.systemUTC())), null));
    }

    static void writeFile () {
        List<String> lines = new ArrayList<>();
        for (Task i : taskList) {
            lines.add(i.savelines());
        }
        try {
            Path myPath = Paths.get("data.txt");
            Files.write(myPath, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Task added");
    }








    /*
    static void addLine (String x, Path myPath) {
        try {
            List<String> lines = Files.readAllLines(myPath);
            lines.add(" [ ] " + x);
            Files.write(myPath,lines);  //vytvori list, natahne do nej text, prida radek a cely soubor prepise novym listem
            // NEBO 29 az 31 nahradis: Files.write(myPath,textToAdd.getBytes(), StandardOpenOption.APPEND);  jen dopise radek do souboru
        } catch (IOException e) {
            System.out.println("Unable to write to file");
        }
    }
    static void checkLine (String x, Path myPath) {
        try {
            int lineIndex = Integer.parseInt(x) - 1;
            try {
                List<String> lines = Files.readAllLines(myPath);
                if (lines.isEmpty()) {
                    System.out.println("Can not check in an empty list");
                } else if (lines.size() <= lineIndex) {
                    System.out.println("Unable to check: index is out of bound");
                } else {
                    lines.set(lineIndex," [x] " + lines.get(lineIndex).substring(4));
                }
                Files.write(myPath,lines);
                // = Files.write(myPath,lines.set(lineIndex+1," [x] " + lines.get(lineIndex+1).substring(4)).getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to check: index is not a number");
        }
    }
    static void removeLine (String x, Path myPath) {
        try {
            int lineIndex = Integer.parseInt(x) - 1;
            try {
                List<String> lines = Files.readAllLines(myPath);
                lines.remove(lineIndex);
                Files.write(myPath,lines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to remove: index is not a number");
        }
    }
    */
}
