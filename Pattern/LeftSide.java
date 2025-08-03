package Pattern;
import java.util.Scanner;


public class LeftSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        int totalLines = num;

        int stars = 1;
        int space = num - 1;
        int currentLine = 1;

        while (currentLine <= totalLines) {
            // Print spaces
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            // Print stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();

            // Update stars and spaces for the next line
            stars++;
            space--;
            currentLine++;
            
        }
    }
}
