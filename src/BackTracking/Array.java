package BackTracking;

public class Array {

    public static void changeArr(int A[],int i, int val){

        //base case

        if(i == A.length){
            printArr(A);
            return;
        }

        //recursion
        A[i] = val;
        changeArr(A,i+1,val+1);
        A[i] = A[i]-2;
    }

    static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        changeArr(A,0,1);
        printArr(A);
    }
}
