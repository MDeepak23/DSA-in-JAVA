import java.util.*;
public class NQueens{
	public static boolean place(int k,int i,int x[]){
		for(int j=1;j<k;j++){
			if(x[j]==i || Math.abs(x[j]-i)==Math.abs(j-k))
				return false;
			
		}
		return true;
	}
	public static void nqueens(int k,int n,int x[]){
		if(k>n){
			for(int i=1;i<=n;i++){
				System.out.print(x[i]+" ");
				}
			System.out.println();
			}
		else{
			for(int i=1;i<=n;i++){
				if(place(k,i,x)){
					x[k]=i;
					nqueens(k+1,n,x);
					}
				}
			}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[]  = new int[n+1];
		nqueens(1,n,x);
		}
}
			
