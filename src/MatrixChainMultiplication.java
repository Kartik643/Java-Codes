public class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] dimensions) {
        int n = dimensions.length - 1; // Number of matrices
        int[][] dp = new int[n][n];

        // Initialize the dp matrix with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }

        // Fill the dp matrix using bottom-up approach  
        for (int chainLength = 2; chainLength <= n; chainLength++) {
            for (int i = 0; i < n - chainLength + 1; i++) {
                int j = i + chainLength - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        // The result is stored in dp[0][n-1]
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] dimensions = {10, 30, 5, 60};
        int minimumMultiplications = matrixChainOrder(dimensions);
        System.out.println("Minimum number of multiplications: " + minimumMultiplications);
    }
}
