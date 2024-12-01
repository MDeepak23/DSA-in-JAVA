import java.util.*;
class Rotatedarray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d%=n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        for(int i:arr){
            System.out.println(i);
        }

        
    }
      static void rev(int arr[],int start,int end){
        int t;
        while(start<end){
        t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
        start++;
        end--;
    }
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotated index");
        int d = sc.nextInt();
        rotateArr(arr,d);
        // 1 2 3 4 5  d=2
        // 3 4 5 1 2

      }
  
}