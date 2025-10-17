import java.util.*;
class NumofOccurences{
    int left(int arr[],int target){
        int i=0,j=arr.length-1;
        int res = arr.length;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>=target){
                res = mid;
                j = mid-1;
            }
            else{
                i= mid+1;
            }
        }
        return res;
    }
    int right(int arr[],int target){
        int i=0,j=arr.length-1;
        int res = arr.length;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>target){
                res = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return res;

    }

    int countFreq(int arr[],int target){
        return right(arr,target)-left(arr,target);
    }
    
      
   public static void main(String[] args) {
       int arr[] = {1,1,2,2,2,2,3};
       int target = 2;
       NumofOccurences obj = new NumofOccurences();
       System.out.println(obj.countFreq(arr,target));
   }
}
