package Searching;

public class ThreeSum {
    public static int[] threeSum(int[] nums, int target) {
        int length = nums.length - 1;

        int answer[] = new int[3];
        for(int i=0; i<=length; i++){
            for(int j=i+1; j<=length; j++){
                for(int k=j+1; k<=length; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return answer;
    }

    public static void threeSumSortArr(int[] nums, int target) {
        int length = nums.length - 1;

        for(int i=0; i<=length; i++){
            int newTarget = target - nums[i];
            int l=i+1, r=length;

            while(l < r){
               int currSum = nums[l] + nums[r];
               if(currSum == newTarget){
                System.out.println("The Target is: " +i+" "+l+" "+r);
                l++;
                r--;
               } else if(currSum < newTarget){
                l++;
               } else {
                r--;
               }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 11, 12, 14};
        int target = 25;
        int[] result = threeSum(arr, target);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
        System.out.println("After target sum");
        threeSumSortArr(arr, target);
    }
}
