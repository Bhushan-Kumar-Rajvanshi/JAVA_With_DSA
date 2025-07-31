package Basic_Java;
import java.util.Scanner;


public class LeapYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if(year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
