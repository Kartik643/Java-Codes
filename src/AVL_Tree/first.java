//package AVL_Tree;
//
//import BST.buildBST;
//import BinaryTree.TreeHeight;
//
//import java.util.ArrayList;
//
//public class first {
//    static class Node{
//        public int height;
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data = data;
//        }
//    }
//    public static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//
//        int LH = height(root.left);
//        int RH = height(root.right);
//        return Math.max(LH,RH) +1;
//    }
//
//    public static Node insert(Node root, int val){
//        if(root == null){
//            root = new Node(val);
//            return root;
//        }
//
//        if(root.data>val){
//            root.left = insert(root.left,val);
//        }else{
//            root.right = insert(root.right,val);
//        }
//        return rotate(root);
//    }
//
//    private static Node rotate(Node node){
//        if(height(node.left)-height(node.right) > 1){
//            // left heavy
//
//            if(height(node.left.left)-height(node.left.right) > 0){
//                //left left case
//                return rightRotate(node);
//            }
//
//            if(height(node.left.left)-height(node.left.right) < 0){
//                //left right case
//                node.left = leftRotate(node.left);
//                return rightRotate(node);
//            }
//        }
//
//        if(height(node.left)-height(node.right) < -1){
//            // right heavy
//
//            if(height(node.right.left)-height(node.right.right) < 0){
//                //right right case
//                return leftRotate(node);
//            }
//
//            if(height(node.right.left)-height(node.right.right) > 0){
//                //left right case
//                node.right = rightRotate(node.left);
//                return leftRotate(node);
//            }
//        }
//        return node;
//    }
//
//    public static Node rightRotate(Node p){
//        Node c = p.left;
//        Node t = c.right;
//        c.right = p;
//        p.left = t;
//
//        p.height = Math.max(height(p.left),height(p.right) + 1);
//        c.height = Math.max(height(c.left),height(c.right) + 1);
//        return c;
//
//    }
//
//    public static Node leftRotate(Node c){
//        Node p =c.right;
//        Node t = p.left;
//        p.left = c;
//        c.right = t;
//
//        p.height = Math.max(height(p.left),height(p.right) + 1);
//        c.height = Math.max(height(c.left),height(c.right) + 1);
//        return p;
//
//    }
//
//
//
//    public static void inorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//
//
//    public static boolean search(Node root, int key){
//        if(root == null){
//            return false;
//        }
//        if(root.data == key){
//            return true;
//        }
//
//        if(root.data>key){
//            return search(root.left,key);
//        }else{
//            return search(root.right,key);
//        }
//    }
//
//    public static Node delete(Node root, int val) {
//        if (root == null) {
//            return null;
//        }
//
//        if (root.data < val) {
//            root.right = delete(root.right, val);
//        } else if (root.data > val) {
//            root.left = delete(root.left, val);
//        } else {
//            if (root.left == null && root.right == null) {
//                return null;
//            } else if (root.left == null) {
//                return root.right;
//            } else if (root.right == null) {
//                return root.left;
//            }
//
//            Node IS = inorderSuccessor(root.right);
//            root.data = IS.data;
//            root.right = delete(root.right, IS.data);
//        }
//        return root;
//    }
//
//    public static Node inorderSuccessor(Node root) {
//        while (root.left != null) {
//            root = root.left;
//        }
//        return root;
//    }
//
//    public static void printRanger(Node root, int k1, int k2){
//        if(root == null){
//            return;
//        }
//
//        if(root.data>=k1 && root.data<=k2){
//            printRanger(root.left, k1,k2);
//            System.out.print(root.data + " ");
//            printRanger(root.right,k1,k2);
//        }
//
//        else if(root.data<k1){
//            printRanger(root.left,k1,k2);
//        }else{
//            printRanger(root.right,k1,k2);
//        }
//
//    }
//    public static void printPath(ArrayList<Integer> path){
//        for(int i = 0;i<path.size();i++){
//            System.out.print(path.get(i) + "-->");
//        }
//        System.out.println("Null");
//    }
//    public static void printRootLeaf(Node root, ArrayList<Integer> path){
//        if(root == null){
//            return;
//        }
//        path.add(root.data);
//        if(root.left == null && root.right == null){
//            printPath(path);
//        }
//        printRootLeaf(root.left,path);
//        printRootLeaf(root.right,path);
//
//        path.remove(path.size()-1);
//
//    }
//    public static void main(String[] args) {
////        int[] values = {8,5,3,1,4,6,10,11,14};
////        Node root = null;
////        for(int i:values){
////            root = insert(root,i);
////        }
////
////        inorder(root);
//////        System.out.println();
//////        if(search(root,100)){
//////            System.out.println("present");
//////        }else{
//////            System.out.println("not present");
//////        }
//////
//////        delete(root,5);
//////        inorder(root);
////        System.out.println();
////        printRanger(root,5,12);
////
////        printRootLeaf(root, new ArrayList<>());
//
//        first AV = new first();
//        for(int i = 0;i<10;i++){
//            AV.insert(i);
//        }
//        System.out.println(AV.height());
//    }
//}
