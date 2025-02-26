import java.util.*;
public class QuickSort {
    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int partition(int a[],int low,int high){
        int pivot = a[low];
        int i = low+1;
        int j = high;
        while(i<=j){
            while(i<=j && pivot>=a[i]){
                i++;
            }
            while(i<=j && pivot<=a[j]){
                j--;
            }
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a,low,j);
        return j;
    }
    public static void quickSort(int a[],int low,int high){
        if(low<high){
        int j = partition(a, low, high);
        quickSort(a, low, j-1);
        quickSort(a, j+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int a[]  = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        quickSort(a,0, n-1);
        for(int k:a)
            System.out.println(k+" ");
    }
}
