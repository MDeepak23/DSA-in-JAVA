
import java.util.*;
public class validAnagram {
    public static boolean Check(String s1,String s2){
       HashMap<Character,Integer> a = new HashMap<>();
        int n = s1.length();
        int m = s2.length();
        if(n!=m){
            return false;
        }
      
            for(int i=0;i<n;i++){
                a.put(s1.charAt(i),a.getOrDefault(s1.charAt(i),0)+1);
            
            }
            for(int i=0;i<m;i++){
                a.put(s2.charAt(i),a.getOrDefault(s2.charAt(i),0)-1);
            
            }
            for(Map.Entry<Character,Integer> entry : a.entrySet()){
                if(entry.getValue()!=0){
                    return false;
                }

            }
            return true;
        }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
       
            System.out.println(Check(s1, s2));
        }
    }

