
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = solution.maxArea(height);
        
        System.out.println("The maximum area is: " + result);
    }
}
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            max = Math.max(max, (j - i) * (Math.min(height[i], height[j])));
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] == height[j]) {
                j--;
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
