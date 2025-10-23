import java.util.ArrayList;
import java.util.Arrays;

public class CountDaysWithoutMeeting {

    public static int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int c=0;
        int temp[];
        res.add(new int[]{meetings[0][0],meetings[0][1]});
        for(int i=1;i<meetings.length;i++){
            temp = res.get(res.size()-1);
            if(meetings[i][0] > temp[1]){
                c+= meetings[i][0]-temp[1] -1;
                res.add(new int[]{meetings[i][0],meetings[i][1]});
            }
            else{
                temp[1] = Math.max(temp[1],meetings[i][1]);
            }
           
            
        }
          temp = res.get(res.size()-1);
          c += res.get(0)[0] - 1;
          c+= days-temp[1];
        return c;
    }
    public static void main(String[] args) {
        int meetings[][] = new int[][]{{3,4},{4,8},{2,5},{3,8}};
        int days = 8;
        System.out.println(countDays(days, meetings));
    }
}    

