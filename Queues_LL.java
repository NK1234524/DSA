public class Queues_LL {

    static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = next ;
        }
    }

    static class Queue{
        static Node head = null ;
        static Node tail = null ;

        public static boolean isEmpty(){
            return head== null && tail == null ;
        }
        
        //Add

       public static void add(int data){
        Node newNode = new Node(data);
        if(head==tail){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
       }


        //Remove 

       public static int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int front = head.data;
        if(head==tail){
            head=tail=null;
            return -1 ;
        }
        else{
            head = head.next ;
        }
        return front;
       }

        //peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty here ");
                return -1;
            }
            return head.data ;
        }
    }


}