public class FibonacciAndBinomial {

    static int nthFibonacci(int n){
        // code here
        int[] A  = new int[n+1];
        A[1] = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        for(int i = 2;i<=n;i++){
            A[i] = (A[i-1] + A[i-2]);
        }

        return A[n]%1000000007;
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(15));
    }
}
