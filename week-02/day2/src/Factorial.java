//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {
    public static void main(String[] args) {
        int choice = 5;
        factorio(choice);
    }

    public static void factorio(int j) {
        int fac = 1;
        for (int i = 0; i < j; i++){
            fac *= (j - i);
        }
        System.out.println("The factorial is " + fac);
    }
}
