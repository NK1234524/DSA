public class Lowest_Common_Ancestor {
    static class Node {
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left =null;
            this.right = null;
        }
    }


    public static Node LCA(Node root , Node p , Node q){
        if(root == null ||root==p || root== q){
            return root ;
        }
       Node left =  LCA(root.left, p, q);
       Node right = LCA(root.right, p, q);

        if(left!=null && right!=null){
            return root ;
        } 

        return (left!=null)?left:right;
    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left =new Node(5);
        root.left.left.left = new Node(6);
        
       Node ans =  LCA(root, root.left,root.right.left);
       System.err.println(ans.data+" ");
    }    
}
