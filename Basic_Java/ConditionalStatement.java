package Basic_Java;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // if(number % 2 == 0) {
        //     System.out.println(number + " is even.");
        // } else {
        //     System.out.println(number + " is odd.");
        // }


        // String ans;
        // ans = (number % 2 == 0 ? "Even Number" : "Odd Number");
        // System.out.println("Value is: " + ans);


        if(number <= 12){
            System.out.println(number + " is a child.");
        } else if (number <= 18) {
            System.out.println(number + " is a teenager.");
        } else {
            System.out.println(number + " is an adult.");
        }
    }
}

