
import java.util.*;
public class Pairsum{
    public void pairsum(int a[],int n,int target){
        int i=0,j=n-1;
        while(i<j){
            int p = a[i]+a[j];
            if(p >target)
                j--;
            else if(p < target)
                i++;
            else {
                System.out.println(a[i]+","+a[j]);
                break;
            }
                

        }
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int target = sc.nextInt();
        Pairsum obj = new Pairsum();
        obj.pairsum(a,n,target);
     }
}