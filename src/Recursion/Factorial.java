package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

    static int fact(int N){
        if(N <= 1){
            return 1;
        }
        return N*fact(N-1);
    }
    static int sumN(int N){
        if(N <= 1){
            return 1;
        }
        return N+sumN(N-1);
    }
}
