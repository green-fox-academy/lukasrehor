public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println("Attendee spends " + 6 * 5 * 17 + " hours by coding.");
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("That is " + ((6 * 5 * 17) / (52 *17.) * 100.) + " % of all semester hours.");
    }
}