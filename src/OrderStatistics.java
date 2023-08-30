import java.util.Random;

public class OrderStatistics {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int i = 1;
        int result = medianOfMedians(arr, 0, arr.length - 1, i);
        System.out.println("The " + i + "st smallest element is: " + result);
    }

    static int medianOfMedians(int A[], int low, int hi, int i){
        if (low <= hi) {
            if (low == hi) {
                return A[low];
            }

            int pivotIndex = getMedianOfMediansIndex(A, low, hi);
            pivotIndex = partition(A, low, hi, pivotIndex);

            if (i - 1 == pivotIndex) {
                return A[pivotIndex];
            }
            if (i - 1 < pivotIndex) {
                return medianOfMedians(A, low, pivotIndex - 1, i);
            }
            return medianOfMedians(A, pivotIndex + 1, hi, i);
        }
        return -1;
    }

    static int getMedianOfMediansIndex(int[] A, int low, int hi) {
        int n = hi - low + 1;
        int numMedians = (n + 4) / 5;
        int[] medians = new int[numMedians];

        for (int i = 0; i < numMedians; i++) {
            int subLow = low + i * 5;
            int subHigh = Math.min(low + i * 5 + 4, hi);
            medians[i] = bruteForce(A, subLow, subHigh, (subHigh - subLow + 1) / 2 + 1);
        }

        return medianOfMedians(medians, 0, numMedians - 1, numMedians / 2 + 1);
    }

    static int bruteForce(int A[], int low, int hi, int i) {
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

            if (i - 1 <= e) {
                return bruteForce(A, low, e, i);
            }
            if (i - 1 >= s) {
                return bruteForce(A, s, hi, i);
            }
            return A[i - 1];
        }
        return -1;
    }

    static int partition(int[] arr, int low, int high, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, high);
        int storeIndex = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }

        swap(arr, storeIndex, high);
        return storeIndex;
    }
    static int RandomizedPartition(int A[], int low, int hi, int i){
        if (low <= hi) {
            if (low == hi) {
                return A[low];
            }

            // Randomized Partition
            int randomIndex = new Random().nextInt(hi - low + 1) + low;
            swap(A, randomIndex, hi);

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

            if (i - 1 <= e) {
                return RandomizedPartition(A, low, e, i);
            }
            if (i - 1 >= s) {
                return RandomizedPartition(A, s, hi, i);
            }
            return A[i - 1];
        }
        return -1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
