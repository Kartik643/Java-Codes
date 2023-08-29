public class SmallestMissinng {
    public static void main(String[] args) {
        int[] A = {0,1,3,4,5,6};
        System.out.println(missing(A));
    }

    static int missing(int[] A){
        int l = 0;
        int h = A.length;

        while(l<=h){
            int m = l+(h-l)/2;

            if (A[m] == m) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }
}
