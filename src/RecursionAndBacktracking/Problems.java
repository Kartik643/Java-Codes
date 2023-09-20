package RecursionAndBacktracking;


public class Problems {

    static void Names(int i, int n){   // O(n)
        if(i>n){
            return;
        }

        System.out.println("Kartik");
        Names(i+1,n);
    }

    static void LinearlyPrint(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        LinearlyPrint(i+1,n);
    }

    static void LinearlyReverse(int i, int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        LinearlyReverse(i,n-1); 
    }
    static void printInc(int n){

        if(n == 1){
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
//        Names(1,4);
//        LinearlyPrint(1,5);
//        LinearlyReverse(1,5);
//
//        printInc(10);


        System.out.println(factorial(5));
    }
}
