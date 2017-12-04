import java.util.Scanner;

// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println("10 / " + divisor + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }

    }
}