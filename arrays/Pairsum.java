// leetcode twosum problem 
import java.util.*;

class Pairsum{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comple = target - nums[i];
            if (a.containsKey(comple)) {
                return new int[]{a.get(comple), i};
            }
            a.put(nums[i], i);
        }
        return new int[]{};
    }

    // Example test
    public static void main(String[] args) {
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target))); // Output: [0, 1]
    }
}
