import java.util.*;
class Stocks{
    public int stock(int prices[],int n){
        int buy = prices[0],sell=0;
        for(int i=0;i<n;i++){
            if(prices[i]>buy){ 
               sell = Math.max(sell,prices[i]-buy);
               
            }
            buy = Math.min(buy,prices[i]);
        }
        System.out.println("buying the stock "+buy);
        return sell;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stocks obj = new Stocks();
        int n = sc.nextInt();
        int prices[]=new int[n];
        for(int i =0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        System.out.println("profit is "+obj.stock(prices,n));
    }
}