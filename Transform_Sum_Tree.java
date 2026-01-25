public class Transform_Sum_Tree {

    static class Node{
        int data ;
        Node left , right;
        Node(int data){
            this.data = data ;
            this.left = null;
            this.right=null;
        }
    }
    
    public static int transform(Node root) {
    if (root == null) 
            return 0;

    int left = transform(root.left);
    int right = transform(root.right);

    int oldValue = root.data;

    root.data = left + right;

    return oldValue + left + right;
}


    public static void Preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new  Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.left = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        Preorder(root);
        
       
    }
    
}
