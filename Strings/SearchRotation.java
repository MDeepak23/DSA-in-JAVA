class SearchRotation {
    public static void lps(String pat,int []lps){
      int len=0,i=1;
      
      while(i<pat.
      length()){
          if(pat.charAt(len)==pat.charAt(i)){
              len++;
              lps[i]= len;
              i++;
          }
          else{
              if(len!=0){
                  len=lps[len-1];
              }
              else{
                  lps[i]=0;
                  i++;
              }
          }
      }
    }
    public static boolean areRotations(String s1, String s2) {
        // code here
        
        String txt = s1+s1;
        String pat = s2;
        int []lps = new int[pat.length()];
        lps(pat,lps);
        int i=0,j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==pat.length()){
                    return true;
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
        
        return false;
        
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ceab";
        System.out.println(areRotations(s1,s2));
    }
}