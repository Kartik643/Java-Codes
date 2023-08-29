import java.util.*;

public class DiffPairs {

    public static int[][] diffPairs(int[] A, int k) {
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {  // Start from i + 1 to avoid duplicate pairs
                if (Math.abs(A[i] - A[j]) == k) {
                    pairs.add(new int[]{A[i], A[j]});
                }
            }
        }

        return pairs.toArray(new int[0][]); // Convert the list to a 2D array
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 7, 5, 6, 3};
        int k = 4;
        int[][] result = diffPairs(A, k);

        if (result.length > 0) {
            for (int[] pair : result) {
                System.out.println("Pair: " + pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("No such pairs found.");
        }
    }
}
