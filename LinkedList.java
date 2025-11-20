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
    public static int size;

    public void addFirst(int data){
        //step1 : create new node 
        Node newNode =new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail =newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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



    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail =null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty here");
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
        int val =prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int search(int key){
    Node temp = head;
    int i=0;

    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
  }
//Recurssive Search
  public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx =helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head,key);
}

public void reverse(){
    Node next;
    Node curr = head = tail;
    Node prev=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev = curr;
        curr = next;
    }
    head=prev;
}

public void NthendDelete(int n){
    Node temp = head;
    int size = 0;
    while(temp!=null){
        size++;
        temp = temp.next;
    }
    if(size==n){
        head=head.next;
        return ;
    }
    Node prev = head;
    int iNthend = size - n;
    for(int i=1 ; i<iNthend ; i++){
        prev = prev.next;
    }
    prev.next = prev.next.next;
    return ;
}
//Turtle Hare algorithm
public Node FindMid(Node head){
    Node fast = head;
    Node slow = head;
    while(fast!=null && fast.next!=null){
        fast = head.next.next;
        slow = head.next;
    }
    return slow;
}

public boolean checkPalindrome(){
    if(head==null && head.next==null){
        return true;
    }
    Node midNode = FindMid(head);
    Node prev = null;
    Node curr = midNode;
    Node next ;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        right=right.next;
        left=left.next;
    }
    return true;
}

//Floyed cycle detecting code :
public static boolean detectCycle(){
     Node Slow = head;
     Node Fast = head;
     while(head!=null && head.next!=null){
        Slow = head.next;
        Fast = head.next.next;
        if(Slow == Fast){
            return true;
        }
     }
    return false;
}

public static void RemoveCycle(){
    Node slow = head ; 
    Node fast = head ;
    boolean isCyclic = false ;
    while(fast!=null && fast.next!=null){
        slow = head.next ;
        fast = head.next.next ;
        if(slow == fast){
            isCyclic = true ;
            break;
        }
    }
    if(isCyclic == true){
        return ;    
    }
    Node prev = null ;
    slow = head ;
    while(slow!=fast){
        prev = fast;
        slow = head.next ;
        fast = head.next;
    }
    prev.next = null ;
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); 
         
        ll.addFirst(1);
       
        ll.addFirst(2);
       
        ll.addLast(3);
       
        ll.addLast(4);
              
        ll.add(2, 1);
        ll.Print();
     
        System.out.println("The length of the linked list is : "+ll.size);
        System.out.println("The index value of element is : "+ll.search(3));
        System.out.print("The index value of element is : "+ll.recSearch(2));
        ll.reverse();
        ll.Print();        
    }
}