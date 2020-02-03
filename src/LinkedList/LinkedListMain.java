package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        Node n1 = new Node();
        n1.data = 100;

        Node n2 = new Node();
        n2.data = 200;

        Node n3 = new Node();
        n3.data = 300;

        Node n4 = new Node();
        n4.data = 400;

        Node n5 = new Node();
        n5.data = 500;

        list.insert(n1);
        list.display();
        list.insertAtBeginning(n2);
        list.display();
        //inserting n3 that is 300 after n1 that is 100
        list.insertAfterNode(n3, n1);
        list.display();
        //inserting n4 that is 400 before n2 tthat is 200
        list.insertBeforeNode(n4, n2);
        list.display();
        System.out.println("test");
        list.deleteBeforeNode(n3);
        //list.deleteAfterNode(n2);
        list.display();
        list.insert(n5);
        list.display();
        //list.deleteFromBeginning();
        //list.sort();
        list.display();
    }

}

