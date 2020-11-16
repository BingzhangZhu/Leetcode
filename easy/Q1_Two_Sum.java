package easy;

import java.util.Arrays;

public class Q1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target-nums[i]==nums[j]){
                    return new int[]{i,j};
                };
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q1_Two_Sum().twoSum(new int[]{2,7,5,1},9)));
    }
}
