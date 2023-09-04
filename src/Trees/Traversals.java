package Trees;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right = null;
    }
}
public class Traversals {

    static void PreOrder(Node root, ArrayList<Integer> preOrder){
        if(root == null){
            return;
        }
        preOrder.add(root.data);
        PreOrder(root.left, preOrder);
        PreOrder(root.right,preOrder);
    }

    static void Inorder(Node root, ArrayList<Integer> InOrder){
        if(root == null){
            return;
        }
        Inorder(root.left, InOrder);
        InOrder.add(root.data);
        Inorder(root.right,InOrder);
    }

    static void postOrderTrav(Node curr, ArrayList < Integer > postOrder) {
        if (curr == null)
            return;

        postOrderTrav(curr.left, postOrder);
        postOrderTrav(curr.right, postOrder);
        postOrder.add(curr.data);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList < Integer > preOrder = new ArrayList< >();
        PreOrder(root, preOrder);

        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> InOrder = new ArrayList<>();
        System.out.print("Inorder traversal: ");
        Inorder(root, InOrder);
        for(int i = 0;i<InOrder.size();i++){
            System.out.print(InOrder.get(i)+ " ");
        }
        System.out.println();
        ArrayList < Integer > postOrder = new ArrayList < > ();
        postOrderTrav(root, postOrder);

        System.out.print("The postOrder Traversal is : ");
        for (int i = 0; i < postOrder.size(); i++) {
            System.out.print(postOrder.get(i) + " ");
        }
    }
}
