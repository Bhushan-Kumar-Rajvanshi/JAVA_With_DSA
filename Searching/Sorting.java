package Searching;

public class Sorting {
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-1-i; j++){
            // for(int j=0; j<=n-2-i; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
            }
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length-1;

        for(int i=0; i<=n-1; i++){
            int maxEleIndex = 0;
            for(int j=0; j<=n-1-i; j++){
                if(arr[j] > arr[maxEleIndex]){
                    maxEleIndex = j;
                }
            }
            int temp = arr[maxEleIndex];
            arr[maxEleIndex] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7, 4, 9, 6, 0, 10};
        // bubbleSort(arr);
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
