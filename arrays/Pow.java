import java.util.*;
class Pow{     
    public int pow(int x , int n){
        int bin=n;
        int ans=1;
        while(bin!=0){      // binary exponentiation 
            if(bin%2==1)
                ans*=x;
            x*=x;
            bin/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Pow obj = new Pow();
        System.out.println(obj.pow(x,n));
    }
}