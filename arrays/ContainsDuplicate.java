import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
 
    public static boolean ContainsDuplicate(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i]))
              return true;
            a.put(nums[i],1);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(ContainsDuplicate(nums));
    }
}

