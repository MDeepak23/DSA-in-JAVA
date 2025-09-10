//KMP ALGORITHM

import java.util.ArrayList;

public class SearchPattern {
    public static void lps(String pat,int lps[]){
       lps[0] = 0;
       int n = pat.length();
       int len =0;
       int i=1;
       while (i<n) {
        if(pat.charAt(i) == pat.charAt(len)){
            len++;
            lps[i]= len;
            i++;
           
        }
        else{
            if(len!=0){
                len = lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
        
       }
    }
    static ArrayList<Integer> search(String pat, String txt) {
        // code here
        int n = txt.length();
        int m = pat.length();
        int lps[] = new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;
        lps(pat,lps);
        while (i<n) {
            if(txt.charAt(i)== pat.charAt(j)){
                i++;
                j++;
                if(j==m){
                  res.add(i-j);
                  j = lps[j-1];  
                }
            }
            else{
                if(j!=0){
                j = lps[j-1];
                }
                else{
                    i++;
                }
            }
           

        }
       return res;

    }
    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";
        System.out.println(search(pat,txt));
    }
}
