public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
         int n = arr.length;
      int max = arr[0];
      int lproduct=1,rproduct=1;
     
      
      for(int i=0;i<arr.length;i++){
           if(lproduct ==0){
          lproduct =1;
      }
      if(rproduct ==0){
          rproduct =1;
      }
        lproduct*=arr[i];
        int j = n-i-1;
        rproduct *= arr[j];
        max = Math.max(lproduct,Math.max(max,rproduct));
      }
       System.out.println(max);
    }
}
