//public class MedianTrial {
//
//    public static void main(String[] args) {
//        int[] A = {9, 3, 7, 1, 5, 2, 8, 4, 6};   //1
//        System.out.println("Median of an unsorted array is: " + findMedian(A));
//    }
//
//    static void swap(int[] arr, int first, int last) {
//        int temp = arr[first];
//        arr[first] = arr[last];
//        arr[last] = temp;
//    }
//
//    static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//
//        swap(arr, i + 1, high);
//        return i + 1;
//    }
//
//    static int quickSelect(int[] arr, int low, int high, int k) {
//        if (low <= high) {
//            int pivotIndex = partition(arr, low, high);
//
//            if (pivotIndex == k) {
//                return arr[pivotIndex];
//            } else if (k < pivotIndex) {
//                return quickSelect(arr, low, pivotIndex - 1, k);
//            } else {
//                return quickSelect(arr, pivotIndex + 1, high, k);
//            }
//        }
//
//        return -1; // Invalid input or error handling
//    }
//
//    static double findMedian(int[] arr) {
//        int n = arr.length;
//        int mid = n / 2;
//
//        if (n % 2 == 0) {
//            // Array length is even, median is the average of middle two elements
//            int firstMid = quickSelect(arr, 0, n - 1, mid - 1);
//            int secondMid = quickSelect(arr, 0, n - 1, mid);
//            return ((int) (firstMid + secondMid) / 2)+1;
//        } else {
//            // Array length is odd, median is the middle element
//            return quickSelect(arr, 0, n - 1, mid);
//        }
//    }
//}


public class MedianTrial {

    public static void main(String[] args) {
        int[] A = {9, 3, 7, 1, 5, 2, 8, 4, 6};   // 1 2 3 4 5 6 7 8 9
        System.out.println("Median of an unsorted array is: " + findMedian(A));
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int partitionAndSelect(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int pivot = arr[high];
            int i = low - 1;
            int j = low;

            while (j < high) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
                j++;
            }

            swap(arr, i + 1, high);
            int pivotIndex = i + 1;

            if (pivotIndex == k) {
                return arr[pivotIndex];
            } else if (k < pivotIndex) {
                high = pivotIndex - 1;
            } else {
                low = pivotIndex + 1;
            }
        }

        return -1; // Invalid input or error handling
    }

    static double findMedian(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        if (n % 2 == 0) {
            // Array length is even, median is the average of middle two elements
            int firstMid = partitionAndSelect(arr, 0, n - 1, mid - 1);
            int secondMid = partitionAndSelect(arr, 0, n - 1, mid);
            return ((double) (firstMid + secondMid) / 2);
        } else {
            // Array length is odd, median is the middle element
            return partitionAndSelect(arr, 0, n - 1, mid);
        }
    }
}
