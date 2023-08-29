import java.util.Random;

public class OrderStatistics {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int i = 1;
        int result = bruteForce(arr, 0, arr.length - 1, i);
        System.out.println("The " + i + "th smallest element is: " + result);
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

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
