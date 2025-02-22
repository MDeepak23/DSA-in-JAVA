public class BFSAdjList{
	int v;
	LinkedList<Integer>[] adj;
	BFSAdjList(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]= new LinkedList<>();
		}
	public void AddEdge(int src,int dest){
		adj[src].add(dest);
		adj[dest].add(src);
		}
	public void BFS(int start){
		boolean visited[] = new boolean[v];
		Arrays.fill(visited,false);
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visted[start]=true;
		while(!q.isEmpty()){
			int w = q.poll();
			System.out.print(w+" ");
			for(int i: adj[w]){
				if(!visited[i]){
				  visted[i]=true;
				  q.add(i);
				  }
				}
			}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of vertices");
		int v = sc.NextInt();
		System.out.println("enter no of edges");
		int e = sc.nextInt();
		BFSAdjList graph = new BFSAdjList(v);
		for(int i=0;i<e;i++){
			int src = sc.nextInt();
			int dest = sc.nextInt();
			graph.AddEdge(src,dest);
			}
		int start = sc.nextInt();
		System.out.println("bfs traversal from vertex"+start);
		BFS(start);
	}
}
