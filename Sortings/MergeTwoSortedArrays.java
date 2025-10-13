// gfg using without space
import java.util.Arrays;

public class MergeTwoSortedArrays {
     static void mergeArrays(int[] a, int[] b) {
        int i = a.length - 1, j = 0;

       
        while (i >= 0 && j < b.length) {
            if (a[i] < b[j])
                i--;
            else {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }

  
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        mergeArrays(a, b);

        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        for (int ele : b)
            System.out.print(ele + " ");
    }
}


// leetcode 

/*
  class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                  c++;
                  end = Math.min(end,intervals[i][1]);
            }
            else{
                end = intervals[i][1];
            }
        }
        return c;
    }
}
 */
