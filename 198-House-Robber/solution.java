public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        
        int profit1 = nums[0];
        int profit2 = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i = 2; i < nums.length; i++){
            int temp = profit1 + nums[i] > profit2 ? profit1 + nums[i] :  profit2;
            profit1 = profit2;
            profit2 = temp;
        }
        return profit2;
    }
}