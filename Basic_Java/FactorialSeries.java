package Basic_Java;
import java.util.Scanner;

public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();

        int fact = 1;
        // for (int i = 1; i <= num; i++) {
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of " + num + " is: " + fact);


        System.out.print("Enter a number to calculate its power: ");
        int pow = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=pow; i++ ){
            ans *= num;  
        }
        System.out.println(num + " raised to the power of " + pow + " is: " + ans);
    }
}
