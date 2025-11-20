public class prD {

    public class Node{
        int data ;
        Node next ;
        Node prev ;
        Node(int data){
            this.data  =data ;
            this.next = null;
            this.prev = null ;
        }
    }
    private Node head ;
    private Node tail ;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail =null;
            return ;
        }
        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

    public void RemoveFirst(){
        if(head == null){
            System.out.println("Emplty Linked List");
            return ;
        }
        if(head == tail){
            head = tail = null ;
            return ;
        }
        head = head.next;
        head.prev =null;
    }

    public void printList(){
        Node temp = head ;
        while(temp!=null){
            System.out.print("<->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public void ReverseDLL(){
        Node curr = head = tail ;
        Node next ;
        Node prev=null;
        while(curr!=null){
            next  =curr.next ;
            curr.next = prev ;
            curr.prev = next ;
            prev = curr ;
            curr = next ;
        }
    }
    public static void main(String[] args) {
      Doubly_Linked_List LL = new Doubly_Linked_List();
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(5);
        LL.addFirst(7);
        LL.printList();

    }
}