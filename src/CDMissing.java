public class CDMissing {
    static int MissingElement(int[] A){
        int n = A.length;
        if(n<3){
            return -1;
        }
        int cd = (A[n-1] - A[0])/n;
        for(int i = 1;i<n;i++){
            int EV = A[i-1]+cd;
            if(A[i] != EV){
                return EV;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] A = {1,3,5,7,9,11,15};

        int MV = MissingElement(A);
        if(MV != 0){
            System.out.println("missing element in the given array is:" + MV);
        }else{
            System.out.println("There is no missing element in the provided array");
        }
    }
}
