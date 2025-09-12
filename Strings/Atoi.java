// convert string to int without casting using ascii

import java.util.*;
class Atoi{
    public static void main(String[] args) {
        String s = " 1231231231311133";
        int idx = 0,res = 0,sign =1;
        int n = s.length();
        while(idx<n && s.charAt(idx) == ' '){
            idx++;
        }
        while(idx<n && (s.charAt(idx) == '+' || s.charAt(idx) == '-')){
            if(s.charAt(idx) == '-'){
                sign = -1;
                idx++;
            }
        }
        while(idx<n && (s.charAt(idx) >='0' && s.charAt(idx)<='9')){
            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && (s.charAt(idx) - '0') > 7 ){
                res=  sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                break;
            }   
            res = res*10+ (s.charAt(idx++)-'0');
        
            
        }
        System.out.println(res);
    }
}
