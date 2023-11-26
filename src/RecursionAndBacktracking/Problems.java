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

    static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n+Sum(n-1);
    }

    static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n == 0){
            return 0;
        }

        return fib(n-1)+fib(n-2);
    }


    static boolean isSorted(int arr[], int i){

        if(i == arr.length-1){
            return  true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }

    static int firstOcc(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isfound = lastOcc(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return  isfound;
    }

    static int power(int x, int n){

        if(n == 0){
            return 1;
        }

        int xnm1 = power(x,n-1);
        int xn = x*xnm1;
        return xn;
    }

    static int powerOptimized(int a, int n){

        if(n == 0){
            return 1;
        }

        int halfPower = powerOptimized(a,n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2 != 0){
            halfPowerSq *=a;
        }
        return halfPowerSq;
    }

    //Remove Duplicatesin a string

     static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
         if (idx == str.length()) {
             System.out.println(newStr);
             return;
         }
         char currChar = str.charAt(idx);
         if (map[currChar - 'a']) {
             removeDuplicates(str, idx + 1, newStr, map);
         } else {
             map[currChar - 'a'] = true; // Corrected the assignment here
             removeDuplicates(str, idx + 1, newStr.append(currChar), map);
         }

     }


    public static void main(String[] args) {
//        Names(1,4);
//        LinearlyPrint(1,5);
//        LinearlyReverse(1,5);
//
//        printInc(10);

//
//        System.out.println(factorial(5));
//        System.out.println(Sum(5));
//
//        System.out.println(fib(6));

//        int arr[] = {8,3,6,9,5,10,2,5,3};
//        System.out.println(isSorted(arr,0));
//        System.out.println(lastOcc(arr,5,0));

//        System.out.println(powerOptimized(2,10));

        String str = "kartikparsodkar";
        removeDuplicates(str,0, new StringBuilder(""),new boolean[26]);
    }

}
