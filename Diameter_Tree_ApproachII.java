public class Diameter_Tree_ApproachII {
     static class Node{
        int data ;
        Node left , right ;
        Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null;
        }
    }
    static class Info{
        int diameter ;
        int height ;
        Info(int d , int h){
            this.diameter = d;
            this.height = h;
        }
    }
    public static Info diameter_I(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter_I(root.left);
        Info rightInfo= diameter_I(root.right);
        int diameter = Math.max(Math.max(leftInfo.diameter , rightInfo.diameter),(leftInfo.height+rightInfo.height)+1);
        int height = Math.max(leftInfo.height , rightInfo.height)+1;
        return new Info(diameter , height);
    }    
    public static void main(String args[]){
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right  =new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        newNode.right.right = new Node(3);
        newNode.right.right.right = new Node(6);
        Info ans = diameter_I(newNode);
        System.out.print(ans.diameter);
    }    
}
