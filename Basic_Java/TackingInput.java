package Basic_Java;
import java.util.Scanner;

public class TackingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter the Age:");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("your age: " + age);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Sum of two number: " + (num1 + num2));
    
    }
}
