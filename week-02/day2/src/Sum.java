//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter

public class Sum {
    public static void main(String[] args) {
        int il = 5;
        sum(il);
    }

    public static void sum(int j) {
        int sum = 0;
        for (int i = 0; i < j; i++){
            sum += j - i;

    }
        System.out.println(sum);

    }
}
