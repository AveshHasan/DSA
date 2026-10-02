package LinkLIST;

public class DoublyLink{
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null) {
            
            head.prev = node;
            
        }
        head = node;

    }
    public void insertLast(int value)
    {
        Node node = new Node(value);
        Node last = head;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next !=null){
            last = last.next;

        }
        node.next = null;
        last.next = node;
        node.prev = last;
        //last = node;
    }
    public Node find(int val)
    {
        Node node = head;
        while(node!=null)
        {
            if(node.val==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfter(int val, int after){
        Node p = find(after);
        if(p==null){
            System.out.println("Node does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){

            node.next.prev = node;
        }
    }
    public void deleteFirst()
    {
        int value = head.val;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if(head!=null)
        {
            head.prev=null;
        }
    }
    public void deleteLast(){
        if(head.next==null){
            head=null;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    public Node get(int index){
        Node node = head;
        for(int i =0; i<index; i++)
        {
            node = node.next;
        }
        return node;
        

    }
    public void deleteAtIndex(int index)
    {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (index < 0) {
        System.out.println("Invalid index");
        return;
    }
    if (index == 0) {
        deleteFirst();
        return;
    }
    Node node = head;

    for (int i = 0; i < index; i++) {

        if (node == null) {
            System.out.println("Index out of range");
            return;
        }

        node = node.next;
    }

    // Index is out of range
    if (node == null) {
        System.out.println("Index out of range");
        return;
    }

    // Connect previous node to next node
    if (node.prev != null) {
        node.prev.next = node.next;
    }

    // Connect next node to previous node
    if (node.next != null) {
        node.next.prev = node.prev;
    }
}
    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null) {
            System.out.print(node.val+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Reverse the LinkList");
        while(last!=null)
        {
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.next = next;
            this.val = val;
            this.prev = prev;
        }

    }
    
}