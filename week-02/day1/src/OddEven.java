import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.
        System.out.println("Type in any number!");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("Hooray! This number is even!");
        } else {
            System.out.println("Oh no! this is an odd number!");
        }
    }
}
