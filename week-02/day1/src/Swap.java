public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables a and b
        int a = 123;
        int b = 526;
        //introducing new int to store the value for b before swapping.
        int swapIt;

        swapIt = b;
        b = a;
        a = swapIt;

        System.out.println(a);
        System.out.println(b);
    }
}
