package BackTracking;

public class SubTree {
    public static void findSubSet(String str, String ans, int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //Yes choice
        findSubSet(str, ans+str.charAt(i),i+1);

        //No choice
        findSubSet(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "",0);
    }
}
