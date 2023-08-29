//public class opem {
//
//    public static void main(String[] args) {
//        int[] A = {1, 2, 3, 4, 5,6,7};
//        System.out.println("Median of an unsorted array is: " + sort(A, 0, A.length - 1));
//    }
//
//    static void swap(int[] arr, int first, int last) {
//        int temp = arr[first];
//        arr[first] = arr[last];
//        arr[last] = temp;
//    }
//
//    static int sort(int[] A, int low, int hi) {
//        if (low <= hi) {
//            if (low == hi) {
//                return A[low];
//            }
//            int s = low, e = hi;
//            int r = low + (int) (Math.random() * (hi - low + 1));
//            swap(A, r, low);
//            int pivot = A[low];
//
//            while (s <= e) {
//                while (s <= e && A[s] < pivot) {
//                    s++;
//                }
//                while (s <= e && A[e] > pivot) {
//                    e--;
//                }
//                if (s <= e) {
//                    swap(A, s, e);
//                    s++;
//                    e--;
//                }
//            }
//
//            int mid = low + (hi - low) / 2;
//            if (e < mid) {
//                return sort(A, e + 1, hi);
//            } else if (s > mid) {
//                return sort(A, low, s - 1);
//            } else {
//                if (A.length % 2 == 0 && s == mid - 1) {
//                    return (A[s] + A[s + 1]) / 2; // Average of middle two elements
//                } else {
//                    return A[mid];
//                }
//            }
//        }
//        return 0;
//    }
//}

public class opem {

    public static void main(String[] args) {
        int[] A = {4,1,3,2,5,7,6};  // 1,2,3,4,5,6,7
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
            int s = low, e = hi;
            int mid = low + (hi - low) / 2;
            int pivot = A[mid];

            while (s <= e) {
                while (s <= e && A[s] < pivot) {
                    s++;
                }
                while (s <= e && A[e] > pivot) {
                    e--;
                }
                if (s <= e) {
                    swap(A, s, e);
                    s++;
                    e--;
                }
            }

            if (e < mid && s <= mid) {
                return sort(A, e + 1, hi);
            } else if (s > mid && e >= mid) {
                return sort(A, low, s - 1);
            } else {
                if (A.length % 2 == 0 && s == mid + 1) {
                    return (A[mid] + A[mid + 1]) / 2; // Average of middle two elements
                } else {
                    return A[mid];
                }
            }
        }
        return 0;
    }
}
