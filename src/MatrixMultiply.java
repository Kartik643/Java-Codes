//import java.util.Arrays;
//
//public class MatrixMultiply {
//    public static void main(String[] args) {
//        int[][] A = {
//                {1,2},
//                {1,2}
//        };
//
//        int[][] B = {
//                {1, 2},
//                {4, 5}
//        };
//
//        int[][] C = bruteforce(A, B);
//        System.out.println(Arrays.deepToString(C));
//    }
//
//    private static int[][] bruteforce(int[][] a, int[][] b) {
//        int[][] C = new int[a.length][b[0].length];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                for (int k = 0; k < b.length; k++) {
//                    C[i][j] += a[i][k] * b[k][j]; // Corrected indexing
//                }
//            }
//        }
//        return C;
//    }
//
//
//    private static int[][] MatrixMultDAC(int[][] a, int[][] b, int n){
//        if(n == 1) {
//            return bruteforce(a, b);
//        }else{
//            splitMatrix(a,n);
//            splitMatrix(b,n);
//
//        }
//    }
//
//    private static int[][] splitMatrix(int[][] b, int n) {
//
//    }
//
//}
