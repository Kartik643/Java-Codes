package BitwiseOperators;

public class FindUnique {
    public static void main(String[] args) {
        int[] A = {2,3,3,4,2,6,4};
        System.out.println(ans(A));
    }

    private static int ans(int[] A){
        int unique = 0;
        for(int n : A){
            unique ^=n;
        }
        return unique;
    }
}
