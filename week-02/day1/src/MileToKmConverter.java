import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Enter a distance in kilometers to convert it to Miles!");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        float distanceInMiles = userInput / 1.609f;
        System.out.println(userInput + "kilometers equal " + distanceInMiles + "miles.");
    }
}
