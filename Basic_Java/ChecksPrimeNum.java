package Basic_Java;
import java.util.Scanner;

public class ChecksPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not:");
        int num = sc.nextInt();

        if(num <= 1) {
            System.out.println(num + " is not a prime number.");
        }

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }
}
