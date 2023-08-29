import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        int[] A = {3,5,4,2,1};
        sort(A);
        System.out.println(Arrays.toString(A));
    }



    static void sort(int[] A){
        int i = 0;
        while(i<A.length){
            if(A[i]-1 != i){
                swap(A,(A[i]-1),i);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] A, int first, int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }
}
