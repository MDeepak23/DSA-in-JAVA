// leet code smallest range II 
import java.util.*;

public class MinimizeHeightII {
    public static void main(String[] args) {
        
    
  int arr[] = {1,5,8,10};
  int k =2;
  Arrays.sort(arr);
  int n = arr.length;
  int res = arr[n-1]-arr[0];
  int small = arr[0]+k;
  int big = arr[n-1]-k;
  for(int i=0;i<n-1;i++){
    int min = Math.min(small,arr[i+1]-k);
    int max = Math.max(big,arr[i]+k);
    // not necessary
    if(min<0){
        continue;
    }
    //above line in leetcode
    res = Math.min(res,max-min);
  }  
  System.out.println(res);
}
}
