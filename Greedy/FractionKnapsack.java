import java.util.*;
class Item{
    int profit,weight;
    double ratio;
    Item(int profit,int weight){
        this.profit=profit;
        this.weight=weight;
        this.ratio = (double) profit/weight;
    }
}
public class FractionKnapsack {
    public static double MaxProfit(Item[] items,int m){
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double maxp = 0.0;
        for(Item item:items){
            if(item.weight<=m){
                maxp = maxp+item.profit;
                System.out.println("item weight:"+item.weight+ "item profit:"+item.profit);
                m = m-item.weight;
            }
            else{
                double fraction = (double) m/item.weight;
                maxp+=item.profit*fraction;
                System.out.println("item weight:"+item.weight*fraction+ "item profit :"+item.profit*fraction+"- taken"+fraction*100+"%");
                break;
            }
            
        }
        return maxp;

    }

    public static void main(String[] args) {
       Item[] items = {new Item(25,18),
                      new Item(24, 15),
                      new Item(15, 10)
                       };
        int m =20;
        double max = MaxProfit(items,m);
        System.out.println(max);
    }

}
