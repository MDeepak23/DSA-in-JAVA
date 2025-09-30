// 1st method pointer sum, another one DNF(dutch national flag) in leetcode colorSort
import java.util.*;
class Sort012{
   /*   public static void sort012(int[] arr) {
        // code here
        int c1=0,c2=0,c3=0;
        for(int i:arr){
            if(i== 0)
                c1++;
            else if(i==1)
                c2++;
            else
                c3++;
        }
        int idx=0;
        for(int i=0;i<c1;i++){
            arr[idx++] = 0;
        }
         for(int i=0;i<c2;i++){
            arr[idx++] = 1;
        }
         for(int i=0;i<c3;i++){
            arr[idx++] = 2;
        }
    }*/
    public static void colorSort(int arr[]){
        int low=0,mid=0,high = arr.length-1;
          while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                 int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,1,1,0,2,1,0,0};
         colorSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}