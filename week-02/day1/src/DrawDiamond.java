// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {
        System.out.println("Type in a number to define the size of your diamond!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        String star = "*";
        String gap = " ";
        int empty = n / 2;

        while (a < n / 2) {
            for (int i = 0; i < empty - a; i++) {
                System.out.print(gap);
            }
            for (int j = 0; j < 1 + (2 * a); j++) {
                System.out.print(star);
            }
            System.out.println("");
            a += 1;
        }
        while (a >= 0) {
            for (int i = 0; i < empty - a; i++) {
                System.out.print(gap);
            }
            for (int j = 0; j < 1 + (2 * a); j++) {
                System.out.print(star);
            }
            System.out.println("");
            a -= 1;
        }

    }

}