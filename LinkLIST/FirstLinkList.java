package LinkLIST;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class FirstLinkList {
    static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }
    static void display2(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }
    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = insertAtEnd(head, 40);

        head = insertAtBeginning(head, 5);
        display(head);
        display2(head);
    }
}