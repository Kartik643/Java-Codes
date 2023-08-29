public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply(12, 12, 2));
        System.out.println(12*12);
    }
    static int multiply(int p, int q, int n){
        if(n==1){
            return p*q;
        }
        else{
            int[] P = splitNum(p, n);
            int pL = P[0];
            int pH = P[1];
            int[] Q = splitNum(q, n);
            int qL = Q[0];
            int qH = Q[1];
            int p1 = multiply(pL, qL, n/2);
            int p2 = multiply(pH, qH, n/2);
            int p3 = multiply((pL+pH),(qL+qH), n/2);
            return (int) ((Math.pow(10,n)*p1) + (Math.pow(10,n/2) * (p3-p1-p2)) + (p2));
        }
    }
    static int[] splitNum(int a, int n){
        int[] ans = new int[2];
        ans[0] = (int) (a/Math.pow(10, n/2));
        ans[1] = (int) (a%Math.pow(10,n/2));
        return ans;
    }
}