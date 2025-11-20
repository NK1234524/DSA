public class Doubly_Linked_List{
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {  
            // list is empty
            head = tail = newNode;
            return;
        }

        newNode.next = head;   // new node points to the current head
        head.prev = newNode;   // current head points back to new node
        head = newNode;        // new node becomes the head
    }

    // Remove first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) {
            // Only one element in list
            head = tail = null;
            return;
        }

        head = head.next;      // move head forward
        head.prev = null;      // remove backward link
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
   public static void main(String[] args) {
       
   }
}