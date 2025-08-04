package Pattern;
import java.util.Scanner;


public class Butterfly {
    public static void butterflyPattern(int n) {
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the butterfly pattern: ");
        int n = sc.nextInt();
        butterflyPattern(n);
        sc.close();
    }
}
