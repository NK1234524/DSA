public class Minimum_Distance_Tree {

    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node LCA(Node root , int p , int q){
        if(root==null || root.data == p || root.data==q){
            return root;
        }
        Node left = LCA(root.left, p, q);
        Node right = LCA(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }
        return left!=null?left:right;
    }

    public static int lcaDist(Node root ,int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist =lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if(leftDist==-1 &&  rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }

    public static int minDist(Node root ,int n1 ,int n2){
        Node lca = LCA(root ,n1 ,n2);
        int dist1 =lcaDist(lca, n1);
        int dist2 =lcaDist(lca, n2);
        return dist1+dist2;
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int ans = minDist(root, 6, 7);

        System.out.print(ans+" ");


    }
}