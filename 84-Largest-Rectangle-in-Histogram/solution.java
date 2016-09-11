public class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        int square = heights[0];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= heights.length; i++){
            int curt = i == heights.length ? 0 : heights[i];
            while(!stack.isEmpty() && curt < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                square = square > height * width ? square : height * width;
            }
            stack.push(i);
        }
        return square;
    }
}