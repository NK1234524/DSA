import java.util.LinkedList;
import java.util.Queue;
public class Binary_Tree_Traversing {
    public static class Node{
        int data ;
        Node right ;
        Node left ;
        public  Node(int data){
            this.data = data;
            this.right = null;
            this.left  = null ;
        }
    }    
    //Preorder Traversing Ro->L->R
    public static void Preorder(Node root){
        if(root == null){
         //   System.out.print(-1+","+" ");
            return ;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    
    //Inorder Traversing L->Ro->R
      public static void Inorder(Node root){
        if(root == null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    //PostOrder Traversing L->R->Ro
    public static void PostOrder(Node root){
        if(root == null){
            return ;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Level order
    public static void Levelorder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }

        else{
            System.out.print(currNode.data+ " ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }    
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree TREE = new BinaryTree();
        Node root = TREE.BuildTree(nodes);
        Levelorder(root);
    }

    public static class BinaryTree{
        static int idx = -1 ;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null ;
            }
            Node newNode = new Node(nodes[idx]);
            
            newNode.left = BuildTree(nodes);
            newNode.right= BuildTree(nodes);
            return newNode;
        }
    }    
}