public class kth_level{

    static class Node{
        int data ;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null
;        }
    }


    public static void kth(Node root ,int level ,int kth  ){

        if(root == null){
            return ;
        }

        if(level==kth){
            System.out.print(root.data+" ");
            return ;
        }

        kth(root.left, level+1, kth);
        kth(root.right, level+1, kth);        
    }

    public static void main(String args[]){
        
       Node root = new Node(1);
        root.left =new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

        int kth =3;
        kth(root, 1, kth);

       
    }
    
}
