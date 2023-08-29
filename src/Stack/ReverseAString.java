package Stack;

import java.util.Stack;

public class ReverseAString {

    public static String reverseString(String A){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < A.length()){
            s.push(A.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String A = "Kartik";
//        for(int i = 0;i<A.length();i++){
//            s.push(A.charAt(i));
//        }
//
//        while(!s.isEmpty()){
//            System.out.println(s.pop());
//        }

        System.out.println(reverseString(A));
    }
}
