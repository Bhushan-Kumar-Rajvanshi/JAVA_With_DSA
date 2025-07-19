package Basic_Java;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        float principal = sc.nextFloat();
        System.out.println("Enter Rate of Interest:");
        float rate = sc.nextFloat();
        System.out.println("Enter Time in Years:");
        float time = sc.nextFloat();
        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Time in Years: " + time);
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
