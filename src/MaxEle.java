import java.util.*;
public class MaxEle {

    static void MaxMin(int[] A){
        int Fmax = A[0];
        int Smax = A[0];
        for(int i = 0;i<A.length;i++){
            if(A[i]>Fmax){
                Smax = Fmax;
                Fmax = A[i];
            }else if (A[i] > Smax) {
                Smax = A[i];
            }
        }

        System.out.println("First Max is : " + Fmax);
        System.out.println("Second Max is : " + Smax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Insert elements in array: ");
        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Given Array: ");
        for(int i = 0;i<n;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        MaxMin(A);
    }
}
