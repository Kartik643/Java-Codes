package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int N){
        if(N == 0){
            return ;
        }
        fun(N-1);
        System.out.println(N);
    }
}
