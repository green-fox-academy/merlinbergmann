public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int swapIt;

        swapIt = b;
        b = a;
        a = swapIt;

        System.out.println(a);
        System.out.println(b);
    }
}
