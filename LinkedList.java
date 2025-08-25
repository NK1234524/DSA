public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1 : create new node 
        Node newNode =new Node(data);
        //If the Linked List is empty
        if(head == null){
            head = tail = newNode;
            return;
        }                      
        //step2 : newNode next = head
        newNode.next = head;
        //step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }



    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }


    
    public void Print(){
        if(head==null){
            System.out.println("LL is empty here");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); 
         
        ll.addFirst(1);
         ll.Print();
        ll.addFirst(2);
         ll.Print();
        ll.addLast(3);
         ll.Print();
        ll.addLast(4);
        ll.Print();        
    }

}
