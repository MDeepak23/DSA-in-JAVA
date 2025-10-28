//3354. Make Array Elements Equal to Zero


public class MakeArrToZero {
    public static int count(int []nums){
          int sum=0,halfsum=0,c=0;
        for(int i : nums)
           sum+=i;
        for(int i=0;i<nums.length;i++){
            halfsum+=nums[i];
            if(nums[i] == 0){
            if(2*halfsum == sum){
             // Case 1: If total left sum == total right sum
             //  perfectly balanced, both directions (left/right) are valid
                c+=2;
            }
            else if(Math.abs(sum-2*halfsum) == 1){
                 // Case 2: If left and right sums differ by exactly 1
                // → slightly unbalanced, only one direction (toward larger side) is valid
                c+=1;
            }
        }
        }
        return c;
    }


    /*public static int countValidSelections(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                if(isValid(nums,i,1)){
                    //right
                    ans++;
                }
                if(isValid(nums,i,-1)){
                    //left
                    ans++;
                }

            }
        }
        return ans;
    }
    public static boolean isValid(int nums[],int st,int dir){
         int i=st,d=dir;
         int []arr = nums.clone();
         while(i>=0&&i<arr.length){
            if(arr[i] == 0){
                i+=d;
            }
            else{
                arr[i]--;
                d = -d;
                i+=d;
            }
         }
         for(int j : arr){
            if(j!=0){
                return false;
            }
         }
         return true;
    }*/
    public static void main(String[] args) {
        int nums[] = {1,0,2,0,3};
        System.out.println(count(nums));
        //System.out.println(countValidSelections(nums));
    }
}

