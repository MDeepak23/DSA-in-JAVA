import java.util.*;
public class BFSAdjMatrix {
   int v;
   int adj[][];
   boolean visted[];
   BFSAdjMatrix(int v){
    this.v = v;
    adj = new int[v][v];
     visted = new boolean[v];
   }
   public void BFS(int start){
    Arrays.fill(visted,false);
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    visted[start] = true;
    while(!q.isEmpty()){
        int w = q.poll();
        System.out.print(w+" ");
        for(int i=0;i<v;i++){
            if(adj[w][i]==1 && !visted[i]){
                q.add(i);
                visted[i]=true;
            }
        }
    }
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("no of vertices:");
    int v = sc.nextInt();
    BFSAdjMatrix b = new BFSAdjMatrix(v);
    System.out.println("enter adj matrix: "+v+'X'+v );
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            b.adj[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter starting vertex for BFS:");
    int start= sc.nextInt();
    b.BFS(start);

   }
}
