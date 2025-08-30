// import java.util.*;
// class majority2 {
//     public static void main(String[] args) {
//         int arr[] = {2,1,1,1,2,3,5,1,1,2};
//         int n = arr.length;
//         HashMap<Integer,Integer> a = new HashMap<>();
//         ArrayList<Integer> b = new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
           
//             a.put(arr[i], a.getOrDefault(arr[i], 0)+1);
            
           
//         }
//         for(Map.Entry<Integer,Integer> entry : a.entrySet()){
//             if(entry.getValue() > n/3){
//                 b.add(entry.getKey());
//             }
//         }
//         System.out.println(b);
//     }
// }
import java.util.*;
class majority2 {
    public static void main(String[] args) {
        int nums[] = {2,1,2,1,2,2,5,1,1,2};
         int cand1 = 0, cand2 = 0, c1 = 0, c2 = 0;
        int n = nums.length;
        for (int num : nums) {
            if (cand1 == num) {
                c1++;
            } else if (cand2 == num) {
                c2++;
            } else if (c1 == 0) {
                cand1 = num;
                c1++;
            } else if (c2 == 0) {
                cand2 = num;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i : nums) {
            if (i == cand1) {
                c1++;
            }
            if (i == cand2) {
                c2++;
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        if (c1 > n / 3) {
            a.add(cand1);
        }
        if (c2 > n / 3 && cand1 != cand2) {
            a.add(cand2);
        }
        Collections.sort(a);
        System.out.println(a);
    }
}