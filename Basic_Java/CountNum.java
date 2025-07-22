package Basic_Java;
import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to count its digits:");
        int num = sc.nextInt();

        int count = 0;
        // while( num>0 ){
        //     count++;
        //     num = num / 10;
        // }
        // System.out.println("Total number of digits: " + count);


        
        // while ( num>0 ) {
        //    count = count + num % 10; 
        //     num = num / 10;
        // }
        // System.out.println("Total number of digits after adding: " + count);



        while (num > 0) {
            count = count * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + count);
    }
}
