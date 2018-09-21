public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int totalHours = 23;
        int totalMinutes = 59;
        int totalSeconds = 60;
        int remHours = totalHours - currentHours;
        int remMinutes = totalMinutes - currentMinutes;
        int remSeconds = totalSeconds - currentSeconds;
        int seconds = remHours * 3600 + remMinutes * 60 + remSeconds;
        System.out.println(seconds + " seconds remaining.");
    }
}