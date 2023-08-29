package LinkedList;

public class FIrst {
    private Node head;
    private Node tail;

    private int size;

    public FIrst(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }



    // 83. Remove Duplicates
    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //21. Merge two sorted List
    public static FIrst  Merge(FIrst first, FIrst second){
        Node f = first.head;
        Node s = second.head;
        FIrst ans = new FIrst();
        while(f != null && s!= null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(f.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    //Cyclic LinkedList-I
//    public static boolean hasCycle(FIrst head) {
//        FIrst p = head;
//        FIrst q = head;
//        while(p!= null && p.next!=null){
//            q = q.next;
//            p = p.next.next;
//            if(q == p) return true;
//        }
//        return false;
//    }



    //202.Happy Numbers
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        else{
            return false;
        }
    }

    private int findSquare(int number){
        int ans = 0;
        while(number>0){
            int rem = number %10;
            ans += rem*rem;
            number /= 10;
        }
        return ans;
    }





    
        private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
