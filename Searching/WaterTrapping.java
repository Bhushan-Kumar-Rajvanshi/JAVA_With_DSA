package Searching;

public class WaterTrapping {
    public static int maxWater(int[] arr){
      int length = arr.length;
      int result = 0;

      for(int i=0; i < length; i++) {
        for(int j=i+1; j<length; j++) {
          int min = Math.min(arr[i], arr[j]);
          int width = j - i;
          int currArea = min * width;
          result = Math.max(result, currArea);
          }
        }
      return result;
    }


    public static int maxArea(int[] arr){
      int length = arr.length - 1;
      
      int l = 0, r = length;
      int result = 0;
      while( l < r ){
        int h = Math.min(arr[l], arr[r]);
        int w = r - l;

        int currArea = h * w;
        if(currArea > result) {
          result = currArea;
        } 

        if(arr[l] < arr[r]){
          l++;
        } else {
          r--;
        }
      }
      return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxWater(arr);
        System.out.println("Maximum water that can be trapped: " + result);
        int result2 = maxArea(arr);
        System.out.println("Maximum water that can be trapped: " + result2);
    }
}
