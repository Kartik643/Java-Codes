package Trees;

import BackTracking.Array;

import java.security.KeyPair;
import java.util.*;

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

class Pair {
    Node node;
    int hd;

    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
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


    //  LEVEL ORDER TRAVERSAL
    static List<Integer> levelOrder(Node root){
        Queue<Node>Q = new LinkedList<>();
        List<Integer>Ans = new LinkedList<>();
        if(root == null){
            return Ans;
        }

        Q.offer(root);
        while(!Q.isEmpty()){
            if(Q.peek().left != null){
                Q.offer(Q.peek().left);
            }
            if(Q.peek().right != null){
                Q.offer(Q.peek().right);
            }

            Ans.add(Q.poll().data);
        }
        return Ans;
    }


    //MAXIMUM HEIGHT OF THE BINARY TREE
    static int maxHeight(Node root){
        if(root == null) return 0;

        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);

        return 1+Math.max(lh,rh);
    }

    static boolean checkBoolean(Node root){
        return dfsheight(root) != -1;
    }

    static int dfsheight(Node root){
        if(root == null) return -1;

        int lh = dfsheight(root.left);
        if(lh == -1) return -1;
        int rh = dfsheight(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }

    //DIAMETER OF THE TREE
     static int diameter(Node root){
        int[] diameter = new int[1];
        Dheight(root,diameter);
        return diameter[0];
    }
    static int Dheight(Node root, int[] diameter){
        if(root == null){
            return 0;
        }
        int lh = Dheight(root.left, diameter);
        int rh = Dheight(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1 + Math.max(lh, rh);
    }

    //IDENTICAL TREE
    static boolean isIdentical(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null)
            return false;

        return ((node1.data == node2.data) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right));
    }


    //BOUNDRY TRAVERSAL
    static Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(Node root, ArrayList < Integer > res) {
        Node cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
    static void addRightBoundary(Node root, ArrayList < Integer > res) {
        Node cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    static void addLeaves(Node root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    static ArrayList < Integer > printBoundary(Node node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(node) == false) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    // TOP VIEW

    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd)==null) map.put(hd,temp.data);
            if(temp.left != null){
                q.add(new Pair(temp.left,hd-1));
            }

            if(temp.right != null){
                q.add(new Pair(temp.right, hd+1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

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
        System.out.println();
        List<Integer> levelOrderResult = levelOrder(root);
        System.out.print("Level Order traversal: ");
        for (Integer value : levelOrderResult) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Height of the binary Tree is : " + maxHeight(root));

        System.out.println(checkBoolean(root));

        System.out.println("Diameter of the given tree is : " + diameter(root));

        System.out.println();

        ArrayList<Integer> boundaryTraversal;
        boundaryTraversal = printBoundary(root);
        System.out.println("Boundary Traversal of the given tree is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

        System.out.println();
        System.out.println("Top View of the Given tree is : ");
        ArrayList<Integer> topview = topView(root);
        for(int i : topview){
            System.out.print(i + " ");
        }
    }
}
