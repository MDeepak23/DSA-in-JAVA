class Zeroesatend{
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0,4};
        int count = 0;
        for (int i : arr) {
            if(i!= 0){
                arr[count] = i;
                count+=1;
            }
            
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;     
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}