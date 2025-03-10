//single source shortest problem using dijkstra algorithm with paradigm of greedy
import java.util.*;
public class SSSP {
    public static int INF=999;
    public static int Min(int dist[],boolean[] s,int n){
        int minidx=-1,min=INF;
        for(int i=0;i<n;i++){
            if(!s[i]&&dist[i]<min){
                min = dist[i];
                minidx = i;
            }
        }
        return minidx;
    }
    public static void ShortestPath(int cost[][],int dist[],int v,int n){
        boolean[] s = new boolean[n];
        for(int i=0;i<n;i++){
            dist[i] = cost[v][i];
        }
        s[v]=true;
        for(int num=1;num<n;num++){
            int u = Min(dist, s, n);
            if(u==-1) break;
            s[u] = true;
            for(int w=0;w<n;w++){
                if(!s[w]&&dist[u]+cost[u][w]<dist[w])
                    dist[w] = dist[u]+cost[u][w];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of vertices:");
        int v = sc.nextInt();
        int cost[][] = new int[v][v];
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                cost[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter source");
        int source = sc.nextInt();
        ShortestPath(cost,dist,source,v);
        for(int k=0;k<v;k++){
            System.out.println("vertex "+k+":"+(dist[k] == INF ? "INF":dist[k]));
        }
    }
}
