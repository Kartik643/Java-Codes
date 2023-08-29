package Stack;

import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(st,4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
