package Recursion;

class Josephus_Problem  {
    static int helper(int n, int k){
        if(n == 1){
            return 0;
        }

        return (helper(n-1, k) + k) % n;
    }

    static int findTheWinner(int n, int k) {
        return helper(n, k) + 1;
    }

    public static void main(String[] args) {
        // Example usage
//        Josephus_Problem  solution = new Josephus_Problem ();
        int n = 5; // Number of people
        int k = 2; // Counting interval for elimination
        int winner = findTheWinner(n, k);
        System.out.println("The winner is at position: " + winner);
    }
}
