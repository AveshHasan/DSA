package ESDLabT2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class DeletionLinkLast {
    static Node deletionAtIndex(Node head)
    {
        if(head==null)
        {
            return null;
        }
        
    }

    static Node deleteLast(Node head) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        Node temp = head;

        // Stop at second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

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
        head.next.next.next = new Node(40);

        head = deleteLast(head);

        display(head);
    }
}
