//TC-->O(n)
//Approach 1
public class Diameter_Tree {

    public static class Node{
        int data ;
        Node left ,right;

        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static int Height(Node root){
        if(root == null){
            return 0 ;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int Diameter_Tree(Node root){
        if(root == null){
            return 0;
        }
        int ld = Diameter_Tree(root.left);
        int rd = Diameter_Tree(root.right);
        int lh = Height(root.left);
        int rh = Height(root.right);
        int self = (lh+rh)+1;
        return Math.max(self,Math.max(ld , rd));
        
    }
    public static void main(String args[]){
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right  =new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        newNode.right.right = new Node(3);
        newNode.right.right.right = new Node(6);

        System.out.print(Height(newNode)+"\n");
        

        System.out.print(Diameter_Tree(newNode));

    }
}
