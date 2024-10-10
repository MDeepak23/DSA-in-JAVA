import java.util.*;
public class Maxsub{
    public int maxsub(int a[],int n){
        int Max = a[0],sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(Max<sum)
              Max = sum;
            if(sum<0)
              sum = 0;
        }
          return Max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
        Maxsub obj = new Maxsub();
        System.out.println(obj.maxsub(a,n));
     }
}
