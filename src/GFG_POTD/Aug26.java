//package GFG_POTD;
//
//public class Aug26 {
//    static Node reverse(Node head){
//        Node prev = null;
//        Node curr = head;
//        Node next;
//
//        while(curr != null){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    Node compute(Node head)
//    {
//        // your code
//        head = reverse(head);
//        Node p = head;
//        Node q = head;
//        Node temp;
//
//        while(p != null && p.next != null){
//
//            if(p.data > p.next.data){
//                temp = p.next;
//                p.next = temp.next;
//            }else{
//                p = p.next;
//                q = p;
//            }
//        }
//
//        return reverse(head);
//    }
//}
