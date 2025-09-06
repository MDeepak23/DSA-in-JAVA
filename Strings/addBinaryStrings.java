public class addBinaryStrings {
    public static String removeZeroes(String s){
        int first = s.indexOf("1");
        return (first == -1)?"0":s.substring(first);
    }

    public static String AddBinary(String s1,String s2){
         s1 = removeZeroes(s1);
         s2 = removeZeroes(s2);
         int n =s1.length();
         int m = s2.length();
         if(n<m){
            return AddBinary(s2,s1);
         }
         int sum=0,carry = 0;
         int j = m-1;
         StringBuilder res = new StringBuilder();
         for(int i=n-1;i>=0;i--){
            int bit1 = s1.charAt(i)-'0';
            sum = bit1+carry;
            if(j>=0){
                int bit2 = s2.charAt(j);
                sum+=bit2;
                j--;
            }
            int bit = sum%2;
            carry = sum/2;
            res.append((char)(bit+'0'));
         }
         if(carry>0){
            res.append("1");
         }
         return res.reverse().toString();
    }


    public static void main(String[] args) {
        String s1 = "001101";
        String s2 = "111";
        System.out.println(AddBinary(s1, s2));

    }
}
