import java.util.*;

public class BFSAdjList {
    LinkedList<Integer> adj[];
    int v;
    BFSAdjList(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]= new LinkedList<>();
    }
    public void Add(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
  }
    public void BFS(int start){
       boolean visted[] =new boolean[v];
       Arrays.fill(visted,false);
       Queue<Integer> q = new LinkedList<>();
       q.add(start);
       visted[start] = true;
       while(!q.isEmpty()){
        int w = q.poll();
        System.out.print(w+" ");
        for(int i:adj[w]){
            if(!visted[i]){
                visted[i] =true;
                q.add(i);
            }
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int src,dest;
        System.out.println("enter no vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        BFSAdjList b = new BFSAdjList(v);
        System.out.println("enter src and dest:");
        for(int i =0;i<e;i++) {
            src = sc.nextInt();
            dest = sc.nextInt();
            b.Add(src,dest);
        }
        System.out.println("enter starting vertex:");
         int start = sc.nextInt();
         b.BFS(start);
}
}
