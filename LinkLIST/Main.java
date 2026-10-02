package LinkLIST;

public class Main {
    public static void main(String[] args) {
        // LinkL list = new LinkL();
        // list.insertFirst(12);
        // list.insertFirst(9);
        // list.insertFirst(5);
        // list.insertFirst(1);

        // list.insertLast(200);
        
        // list.insert(100,3);
        
        // list.display();
        // //Delete the first value and return its value;
        // System.out.println(list.deleteFirst()+" Removed from first");

        // System.out.println(list.deletelast()+" Removed from last");
        
        // list.display();
        // System.out.println(list.deleteAtIndex(2)+" Removed from index");

        // list.display();
        // System.out.println(list.find(17)+" :This will return the reference variable of value passed in the function or else return null");
        // DoublyLink list = new DoublyLink();
        // list.insertFirst(15);
        // list.insertFirst(25);
        // list.insertFirst(30);
        // list.insertFirst(5);
        // list.insertFirst(15);
        // list.insertFirst(25);
        // list.insertFirst(30);
        // list.insertFirst(5);
        // //Insert at the last of the index
        // list.insertLast(100);

        // //Insert after the given index
        // list.insertAfter(200, 25);
        // System.out.println("Before Deletion:");
        // list.display();
        // list.deleteFirst();
        // list.deleteLast();
        // list.deleteAtIndex(2);
        // System.out.println("After Deletion:");
        // list.display();

        CircularLinkList list = new CircularLinkList();
        list.insertFirst(25);
        list.insertFirst(15);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(1);
        list.display();
        list.delete(7);
        list.display();
    }

}
