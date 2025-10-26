class PeakElement {

    static int peakElement(int[] arr) {
       int n = arr.length;
       if(n==1){
           return 0;
       }
       if(arr[0]>arr[1]){
           return 0;
       }
       if(arr[n-1]>arr[n-2]){
           return n-1;
       }
       int st=1,end=n-2;
       while(st<end){
           int mid = (st+end)/2;
           if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
               return mid;
           }
           if(arr[mid]<arr[mid+1]){
               st = mid+1;
           }
           else{
               end = mid-1;
           }
       }
       return st; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }
}