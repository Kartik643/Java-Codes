import java.util.Arrays;

public class ClosestPairl {

    public static void findClosestPair(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        int F1 = 0;
        int F2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                F1 = arr[i];
                F2 = arr[i + 1];
            }
        }

        System.out.println("Closest pair: " + F1 + " and " + F2 );
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,7,10,15,17};
        findClosestPair(arr);
    }
}
