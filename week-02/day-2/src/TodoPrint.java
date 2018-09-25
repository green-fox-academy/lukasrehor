public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder build = new StringBuilder();
        build.append("My todo:\n");
        build.append(todoText);
        build.append(" - Download games\n");
        build.append("\t - Diablo");
        todoText = build.toString();
        System.out.println(todoText);

        /* or:
        String todoo = "My todo:\n";
        todoText = todoText + " - Download games\n" + "\t - Diablo";
        todoo = todoo.concat(todoText);

        System.out.println(todoo);*/
    }
}