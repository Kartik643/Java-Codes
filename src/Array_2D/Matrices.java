package Array_2D;

import java.util.Scanner;

public class Matrices {

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }

        return false;
    }

    public static int largest(int matrix[][]){
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                }
            }
        }

        return maxElement;
    }

    public static int Smallest(int matrix[][]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3;
        int m = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < n; i++) {
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

//        search(matrix,5);
        System.out.println("Largest Element in the matrix is " + largest(matrix));
        System.out.println("Smallest element in the matrix is " + Smallest(matrix));
    }
}
