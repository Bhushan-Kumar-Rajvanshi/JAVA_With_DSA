package Searching;
import java.util.*;

public class D2_Array {
    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countElement(int[][] arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void printSecondRow(int[][] arr){
        for(int j=0; j<arr[1].length; j++){
            System.out.print(arr[1][j] + " ");
        }
    }

    public static int sumSecondRow(int[][] arr){
        int sum = 0;
        for(int j=0; j<arr[1].length; j++){
            sum += arr[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // System.out.println("Totle element: "+countElement(arr, 4));
        printSecondRow(arr);
        System.out.println("After Second Row" + " ");
        printArray(arr);
        System.out.println("Sum of Second Row: " + sumSecondRow(arr));
        printArray(arr);
        
    }
    
}
