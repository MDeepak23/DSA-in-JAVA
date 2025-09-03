public class FindSmallestMissing {
    public static void main(String[] args) {
        boolean a =false;
        int arr[] = {2,-3,4,1,1,7};
        for(int i=0;i<arr.length;i++){
            while(1<=arr[i]&& arr[i]<=arr.length && arr[i]!=arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                

            }
        }
       
        for(int i =1;i<=arr.length;i++){
            if(arr[i-1]!=i){
                a = true;
                System.out.println(i);
                break;
            }
            
        }
        if(!a){
            System.out.println(arr.length+1);
        }


    }
}
