public class Kth_Ancesstor {

    static class Node{
        int data ;
        Node left , right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int KthAncesstor(Node root , int n , int k){
        if(root == null){
            return -1;
        }
        if(root.data == n ){
            return 0;
        }

        int left_Dist = KthAncesstor(root.left, n, k);
        int right_Dist = KthAncesstor(root.right, n, k);

        if(left_Dist == -1 && right_Dist==-1){
            return -1;
        }
        int max = Math.max(left_Dist, right_Dist);
        if(max+1 ==  k){
            System.out.println();
        }
        return max+1;
    }

    public static void main(String args[]){
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        root.left.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);

        int ans = KthAncesstor(root, 7, 2);
        System.out.print(ans+" Ancesstor of "+root.data);
    }
    
}
