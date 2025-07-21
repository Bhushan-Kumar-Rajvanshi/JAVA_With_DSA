package Basic_Java;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times you want to print number: ");
        int num = sc.nextInt();
        int n = 1;
        int sum = 0;

        // Using a while loop to print numbers from 1 to num
        System.out.println("Using while loop:");
        while (n <= num) {
            System.out.print(" " + n);
            sum = sum + n;
            n++;
        }
        System.out.println(" Total of num: " +sum );



        // Using a do-while loop to print numbers from 1 to num
        System.out.println("Using do-while loop:");
        int n2 = 1; 
        do {
            System.out.print(" " + n2);
            n2++;
        } while (n2 <= num);
        System.out.println();
        // System.out.println(" Total of num: " +sum );


        // Using a for loop to print numbers from 1 to num
        System.out.println("Using For loop:");
        int sum1 = 0;
        for( int n1=1; n1 <=num; n1++  ){
            System.out.print(" " + n1);
            sum1 = sum1 + n1;
        }
        System.out.println(" Total of num: " +sum1 );

    }
}
