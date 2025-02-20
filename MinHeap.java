class MinHeap{
    static int a[];
    static int heapsize;
   static int maxsize;
    MinHeap(int ms){
        maxsize=ms;
        heapsize=0;
        a = new int[maxsize];
    }
    public static int parent(int i){
        return (i-1)/2;
    }
    public static int lchild(int i){
        return 2*i+1;
    }
    public static int rchild(int i){
        return 2*i+2;
    }
    public static void insert(int key){
        if(heapsize==maxsize){
            System.out.println("heap overflow");
            return;
        }
        int i = heapsize;
        a[i]=key;
        heapsize++;
        while(i!=0&&a[i]<a[parent(i)]){
            int temp = a[i];
            a[i] = a[parent(i)];
            a[parent(i)] = temp;
           i = parent(i);
        }
    }
    public static void heapify(int i){
        int min = i;
       int l= lchild(min);
       int r=  rchild(min);
        if(l<heapsize&& a[l]<a[min])
            min=l;
        else if(r<heapsize&& a[r]<a[min])
            min=r;
        if(min!=i){
            int temp = a[min];
            a[min]= a[i];
            a[i] = temp;
            heapify(min);
        }
    }
    public static void remove(){
        if(heapsize==0){
            System.out.println("underflow");
        }
        if(heapsize==1){
          heapsize--;
        }
        else{
            a[0] = a[heapsize-1];
            heapsize--;
            heapify(0);

        }

    }
    public static int getMax(){
        return maxsize;
    }
    public static int currmax(){
        return heapsize;
    }
    public static void main(String[] args) {
        MinHeap m = new MinHeap(15);
        int ele[] = {1,2,3,4,5};
        for(int i:ele){
            insert(i);
        }
        remove();
        for(int j =0;j<heapsize;j++){
            System.out.println(a[j]);
        }
        System.out.println("curr max :"+currmax());
        System.out.println("maxsize :"+getMax());
    }

}