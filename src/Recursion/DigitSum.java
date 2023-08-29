package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumD(1342));
    }
    static int sumD(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumD(n/10);
    }
}
