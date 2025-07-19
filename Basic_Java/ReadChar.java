package Basic_Java;

import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println("You entered: " + ch);
    }
}
