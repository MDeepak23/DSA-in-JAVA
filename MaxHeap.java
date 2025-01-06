class MaxHeap{
    int a[];
    int maxsize,currsize;
    MaxHeap(int maxsize){
        this.maxsize = maxsize;
        currsize = 0;
        a= new int[maxsize];
    }
    static int parent(int i){
        return (i-1)/2;
    }
    static int lchild(int i){
        return 2*i+1;
    }
    static int rchid(int i){
        return 2*i+2;
    }
     void insert(int key){
        if(maxsize == currsize){
            System.out.println("heap over flow");
        }
        int i = currsize;
        a[i] = key;
        currsize++;
        while(i!=0 && a[parent(i)]<a[i]){
            int temp = a[parent(i)];
            a[parent(i)] = a[i];
            a[i] = temp;
            i = parent(i);
        }

    }
    void heapfication(int i){
        int largest = i;
        int l = lchild(i);
        int r = rchid(i);
        if(l<currsize&&a[i]<a[l]){
             largest = l; 
        }
        if(r<currsize && a[i]<a[r]){
            largest = r;
        }
        if(i!=largest){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] =temp;
            heapfication(largest);
        }
    }
    void remove(){
        if(currsize <=0){
            System.out.println("heap under flow");
        }
        if(currsize==1){
            currsize--;
        }
        else{
            a[0] = a[currsize-1];
            currsize--;
            heapfication(0);
        }
    }
    int Max(){
        return a[0];
    }
    int cur(){
        return currsize;
    }
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(15);
        int elements[] = {3, 10, 12, 8, 2, 14};

        for (int e : elements)
        h.insert(e);
        for(int i :a){
            System.out.println(i);
        }

        System.out.println("The current size of the heap is " + h.cur());

        System.out.println("The current maximum element is " + h.Max());

        h.remove();

        System.out.println("The current size of the heap is " + h.cur());


        h.insert(15);
        h.insert(5);
        System.out.println("The current size of the heap is " + h.cur());

        System.out.println("The current maximum element is " + h.Max());
            }
        }
