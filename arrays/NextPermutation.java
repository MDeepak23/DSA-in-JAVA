import java.util.*;
class NextPermutation{
    public static void rev(int nums[]){
        int st =0,end = nums.length-1;
        while(st<end){
            int t = nums[st];
            nums[st] = nums[end];
            nums[end] = t;
            st++;
            end--;
        }
    }
    public static void swap(int nums[],int i,int j){
        int p = nums[i];
        nums[i] = nums[j];
        nums[j] = p;
    }
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        if(n == 1){
            return;
        }

        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
            if(pivot == -1){
             rev(nums);
             return;
            }
        
        for(int i = n-1;i>=pivot;i--){
            if(nums[pivot]<nums[i]){
                swap(nums,pivot,i);
                break;
            }
        }
        int k = pivot+1,j = n-1;
        while(k<j){
            swap(nums,k,j);
            k++;
            j--;
        }
       for(int i:nums){
         System.out.println(i);
      }
    }
public static void main(String []args){
Scanner sc = new Scanner(System.in);
int n  = sc.nextInt();
int nums[] = new int[n];
for(int i = 0; i<nums.length;i++){
  nums[i] = sc.nextInt();
}
nextPermutation(nums);
}
}
