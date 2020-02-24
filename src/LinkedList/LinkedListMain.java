package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(2);
        linkedList.insert(20);
        linkedList.insertAtStart(0);
        linkedList.insertAt(2, 1);
        linkedList.display();
    }
}
