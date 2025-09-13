public class MinCharAddForPalindrome {

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
    static int minChar(String txt) {
        // code here
        int n = txt.length();
       String rev = new StringBuilder(txt).reverse().toString();
       txt =txt+"$"+rev;
       int lps[] = new int[txt.length()];
       lps(txt,lps);
       
       return (n-lps[lps.length-1]);
       

    }
    public static void main(String[] args) {
        String txt = "aacecaaaa";
        
        System.out.println(minChar(txt));
    }
}

