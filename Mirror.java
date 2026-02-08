public class Mirror {
    static class Node{
        int data ;
        Node left , right;

        public Node(int data) {
            this.data = data;
            this.left =left;
            this.right = right;
        }       
    }
    
    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }
        Node rightMirror = Mirror(root.right);
        Node leftMirror = Mirror(root.left);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }

     public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        root.left.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);

       

        // int ans1 = Kth_common_ancestor(root, 5, 2);
        
        // System.out.println(ans1+" ancestor of "+root.data);

       root = Mirror(root);
       preorder(root);


    }
}

