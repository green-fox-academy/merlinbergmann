public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int codingHours = 6 * 5 * 17;
        System.out.println("Average time spent with coding during a semester: " + codingHours + " hours");
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float totalHours = 52 * 17;
        float codingPercentage = codingHours / totalHours * 100;
        System.out.println("A student spends " + codingPercentage + "% of the course with coding.");

    }
}
