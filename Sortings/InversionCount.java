class InversionCount {
    static int[] b;

    static int inversionCount(int arr[]) {
        b = new int[arr.length];
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int arr[], int st, int end) {
        int c = 0;
        if (st < end) {
            int mid = st + (end - st) / 2;
            c += mergeSort(arr, st, mid);
            c += mergeSort(arr, mid + 1, end);
            c += merge(arr, st, mid, end);
        }
        return c;
    }

    static int merge(int arr[], int st, int mid, int end) {
        int c = 0;
        int i = st, j = mid + 1, k = st;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                b[k++] = arr[i++];
            } else {
                c += (mid - i + 1);
                b[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            b[k++] = arr[i++];
        }
        while (j <= end) {
            b[k++] = arr[j++];
        }
        for (int h = st; h <= end; h++) {
            arr[h] = b[h];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int count = inversionCount(arr);
        System.out.println("Inversion Count: " + count);
    }
}
