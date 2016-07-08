public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] longest = new int[nums.length];
        longest[0] = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            longest[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                    if(nums[j] < nums[i]){
                        longest[i] = longest[j] + 1 > longest[i]? longest[j] + 1 : longest[i];
                    }
                }
                max = max > longest[i] ? max : longest[i];
            
        }
        return max;
    }
}