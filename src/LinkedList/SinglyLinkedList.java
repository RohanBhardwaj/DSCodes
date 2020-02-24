package LinkedList;

public class SinglyLinkedList {
    Node head;

    //insert at last
    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    //insert at beginning
    void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //insert at a given index
    void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        Node temp = head;
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    //display
    void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
