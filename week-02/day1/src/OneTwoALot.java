import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        System.out.println("Enter any number!");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        // If the number is zero or smaller it should print: Not enough
        if (userInput <= 0){
            System.out.println("Not enough");
        }

        // If the number is one it should print: One

        if (userInput == 1){
            System.out.println("One");
        }
        // If the number is two it should print: Two
        if (userInput == 2){
            System.out.println("Two");
        }
        // If the number is more than two it should print: A lot
        else System.out.println("A lot");
    }
}
