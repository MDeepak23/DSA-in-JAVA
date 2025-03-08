import java.util.*;
public class Knapsack_01 {
    public static int Knapsack(int w,int wt[],int p[],int n){
        int [][]k = new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0|| j==0)
                    k[i][j]=0;
                else if(wt[i-1]<=j){
                    k[i][j] = Math.max(k[i-1][j],p[i-1]+k[i-1][j-wt[i-1]]);
                }
                else{
                    k[i][j]=k[i-1][j];
                }
            }
        }
        int i=n,j=w;
        while(i>0 &&j>0){
            if(k[i][j]==k[i-1][j])
            {
                System.out.println("index"+i+" 0");
                i--;
            }
            else{
                System.out.println("index"+i+" 1");
                i--;
                j = j-wt[i];
            }
        }
        return k[n][w];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []p = {1,2,5};
        int []wt={2,3,4};
        int m = 6;
        System.out.println("max profit:"+Knapsack(m,wt,p,wt.length));

    }
}
