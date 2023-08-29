package Array_2D;

public class SumOfRows {

    public static int SumRow(int matrix[][]){
        int sum = 0;
        for(int i = 0;i<matrix.length;i++){
            sum += matrix[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(SumRow(matrix));
    }
}
