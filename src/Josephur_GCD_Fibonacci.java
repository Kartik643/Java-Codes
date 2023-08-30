public class Josephur_GCD_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(47));
    }


    static int GCD(int a, int b){
        if(a%b == 0){
            return b;
        }else{
            return GCD(b,a%b);
        }
    }

    static long Fib(int n){
        if(n == 0 || n==1){
            return n;
        }

        return (Fib(n-2)+Fib(n-1));
    }
}
