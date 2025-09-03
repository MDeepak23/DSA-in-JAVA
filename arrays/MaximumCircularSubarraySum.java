public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        int arr[] = {8,-8,9,-9,10,-11,12};
        int n = arr.length;
        int cs=0,currminsum=0,currmaxsum=0;
        int minsum = arr[0],maxsum = arr[0];
        for(int i=0;i<n;i++){
            currmaxsum = currmaxsum+arr[i];
           
            maxsum = Math.max(maxsum,currmaxsum);
             if(currmaxsum<0){
                currmaxsum=0;
            }
            currminsum = currminsum+arr[i];
           
            minsum = Math.min(minsum,currminsum);
             if(currminsum>0){
                currminsum=0;
            }
            cs = cs+arr[i];
        }
        int circularsum = cs-minsum;
        if(cs == minsum){
            System.out.println(maxsum);
        }
        System.out.println(Math.max(circularsum,maxsum));
       

    }
}
