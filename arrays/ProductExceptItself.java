class ProductExceptItself{
    public static void arrpro(int arr[]){
        int a[] = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            int p=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                   p = p*arr[j]; 
                }
            }
            a[i] = p;
        }
        for (int i : a) {
            System.out.println(i);
            
        }

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        arrpro(arr);
    }

}