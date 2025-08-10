package Searching;

public class TwoSum {

    public static int[] TargetSum(int[] arr, int target){
        int length = arr.length - 1;
        int result[] = new int[2];

        for(int i=0; i<=length; i++){
            for(int j=i+1; j<=length; j++){
                if(arr[i] + arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumSortArr(int[] nums, int target) {
        int length = nums.length - 1;

        int l = 0, r = length;
        int result[] = new int[2];
        while(l < r) {
            if(nums[l] + nums[r] == target) {
                result[0] = l;
                result[1] = r;
                return result;
            } else if(nums[l] + nums[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 11, 12, 14};
        int target = 15;
        int[] result = twoSumSortArr(arr, target);
        System.out.println(result[0] + " " + result[1]);
        System.out.println("After target sum");
        int[] result2 = TargetSum(arr, target);
        System.out.println(result2[0] + " " + result2[1]);
    }
}
