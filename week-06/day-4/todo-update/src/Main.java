public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            printUsageInformation();
        }
        else if (args[0].equals("-l")){
            TaskManager.fillList();
            TaskManager.listTasks();
        }
        else if (args[0].equals("-a") && args.length == 1) {
            System.out.println("Unable to add: no task provided");
        }
        else if (args[0].equals("-a")){
            String description = args[1];
            TaskManager.fillList();
            TaskManager.addTask(description);
            TaskManager.writeFile();
        }














        /*
        else if (args[0].equals("-r") && args.length == 1) {
            System.out.println("Unable to remove: no index provided");
        }
        else if (args[0].equals("-r")){
            String x = args[1];
            TaskManager.removeLine(x);
        }
        else if (args[0].equals("-c") && args.length == 1){
            System.out.println("Unable to check: no index provided");
        }
        else if (args[0].equals("-c")) {
            String x = args[1];
            TaskManager.checkLine(x);
        }
        else {
            System.out.println("Unsupported argument");
            System.out.println();
            printUsageInformation();
        }
        */
    }

    private static void printUsageInformation(){
        System.out.println("Command Line Todo application)");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Adds a new task");
        System.out.println(" -r   Removes an task");
        System.out.println(" -c   Completes an task");
    }
}
