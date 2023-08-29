public class Median {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println("Median of an unsorted array is: " + sort(A, 0, A.length - 1));
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int sort(int[] A, int low, int hi) {
        if (low <= hi) {
            if (low == hi) {
                return A[low];
            }
            int s = low + 1, e = hi;
            int r = low + (int) (Math.random() * (hi - low + 1));
            swap(A, r, low);
            int pivot = low;

            while (s <= e) {
                while (s <= e && A[e] >= A[pivot]) {
                    e--;
                }
                while (e > s && A[s] > A[pivot]) {
                    s++;
                }
                if (s < e) {
                    swap(A, s, e);
                    s++;
                    e--;
                }
            }
            swap(A, e, pivot);
            int mid = low + (hi - low) / 2;
            if (e == mid) {
                return A[e];
            } else if (e < mid) {
                return sort(A, e + 1, hi);
            } else {
                return sort(A, low, e - 1);
            }
        }
        return 0;
    }
}
