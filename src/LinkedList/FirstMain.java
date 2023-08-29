package LinkedList;

import DoublyLinkedList.DLL;

public class FirstMain {
    public static void main(String[] args) {
        FIrst list = new FIrst();
        list.insertFirst(12);
        list.insertFirst(45);
        list.insertFirst(15);
        list.insertFirst(2);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(12);
//        list.insertFirst(45);
//        list.insertFirst(15);
//        list.insertFirst(2);
//        list.insertLast(22);
//        list.insertValue(15,65);
//        list.display();
    }
}
