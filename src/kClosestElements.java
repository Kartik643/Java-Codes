import java.lang.reflect.Array;
import java.util.Scanner;

public class kClosestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1,2,4,7,9,12,15,17,18};
        int k = 3;
        int t = 9;

        kClosest(A,k,t);
    }

    private static int kClosest(int[] A, int k, int t){
        int[] dist = new int[A.length];
        for(int i = 0;i< A.length;i++){
            dist[i] = t-A[i];
        }

        for(int i = 0;i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }
        return 0;
    }
}
