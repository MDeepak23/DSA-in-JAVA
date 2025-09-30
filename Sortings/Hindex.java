//an array citations[], where each element citations[i] represents the number of citations received by the ith paper of a researcher. You have to calculate the researcher’s H-index.
//The H-index is defined as the maximum value H, such that the researcher has published at least H papers, and all those papers have citation value greater than or equal to H.
import java.util.*;
public class Hindex {
  /*public static int sortHindex(int []citations){
        Arrays.sort(citations);
        int n = citations.length;
        int idx=0;
        while(idx<n&& citations[n-idx-1]>idx){
            idx++;
        }
        return idx;
  }*/

 public static int hIndex(int[] citations) {
        
        int n = citations.length;
        int freq[] = new int[n+1];
        for(int i=0;i<citations.length;i++){
            if(citations[i] >=n ){
                freq[n]+=1;
            }
            else{
                freq[citations[i]]+=1;
            }
        }
        int total=0;
        for(int i=n;i>=0;i--){
            total+=freq[i];
            if(total>=i){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {3,0,5,3,0};
        System.out.println(hIndex(arr));
    }
}