public class practice {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static  Node head;
    public static  Node tail;
    public static  int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void Print(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty Linked list");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next; 
        }
        System.out.println();
    }

   public void add(int index , int data){
    if(size==0){
        addFirst(data);
        return ;
    }
    int i=0;
    Node newNode = new Node(data);
    Node temp = head;
   while(i<index){  
    temp=temp.next;
    i++;
   }
   newNode.next = temp.next;
   temp.next=newNode;
   }

   public int removefirst(){
    if(size==0){
        System.out.println("Linked List is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size =0 ;
        return val;
    }
    int val = head.data;
    head=head.next;
    size--;
    return val; 
   }

   public int removeLast(){
    if(size==0){
        System.out.println("Linked List is empty here ");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
    Node prev = head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val = prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
   }


    public static void main(String args[]){
        LinkedList LL = new LinkedList();
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addLast(8);
        LL.addLast(9);
        LL.addLast(10);
        LL.add(6, 11);
        LL.Print();
        System.out.println("The size of the Linked List is : "+LL.size);
    }
}