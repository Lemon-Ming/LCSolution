public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            int number = 1;
            int larger = nums[i] + 1;
            while(!set.isEmpty() && set.contains(larger)){
                set.remove(larger);
                larger++;
                number++;
            }
            int smaller = nums[i] - 1;
            while(!set.isEmpty() && set.contains(smaller)){
                set.remove(smaller);
                smaller--;
                number++;
            }
            longest = longest > number ? longest : number;
        }
        return longest;
    }
}