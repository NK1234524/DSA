public class subtree {
    static class Node{
        int data ;
        Node left ;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }

    public static boolean isIdentical(Node node , Node subroot){
        if(node == null && subroot == null){
            return true;
        }        
        else if(node.data != subroot.data || node == null || node == null){
            return false ;
        }
        
        if(!isIdentical(node.left, subroot.left)){
            return false ;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root ,Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true ;
            }
        }
        return isSubtree(root.left , subRoot )||isSubtree(root.right, subRoot);
    }
    public static void main(String args[]){

        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);

        Node newNode1 = new Node(5);
        newNode1.left = new Node(2);
        newNode1.right = new Node(3);
        newNode1.left.left = new Node(4);

        System.out.print(isSubtree(newNode, newNode1));

    }
}