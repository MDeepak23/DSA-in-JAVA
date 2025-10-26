public class SearchinSortedRotated {
    
  
    static int search(int[] arr, int key) {
      

        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;


            if (arr[mid] == key)
                return mid;

            if (arr[mid] >= arr[lo]) {
           
                if (key >= arr[lo] && key < arr[mid])
                    hi = mid - 1;

                else
                    lo = mid + 1;
            }
 
            else {
  
                if (key > arr[mid] && key <= arr[hi])
                    lo = mid + 1;

                else
                    hi = mid - 1;
            }
        }
   
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(search(arr, key));
    }
}

