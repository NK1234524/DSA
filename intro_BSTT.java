
import java.util.*;
public class intro_BSTT {


    static class Node{
        int data;   
        Node left ,right;
        Node(int data){
            this.data = data;
        }

    }


    public static Node BST(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data >data ){
            root.left = BST(root.left, data);
        }
        else{
            root.right = BST(root.right, data);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return ;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
        
    }


    public static boolean Search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return Search(root.left, key);
        }
        else{
            return Search(root.right, key);
        }        
    }


    public static Node delete(Node root ,int val){
        if(root.data<val){
            root.right = delete(root.right ,val);
        }
        else if(root.data >val){
            root.left = delete(root.left ,val);
        }
        else{
            //Case 1 :leaf node 
            if(root.left==null && root.right==null){
                return null;
            }
            //Case 2 :single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //Case 3 :both children
            Node IS = findInorderSuccessor(root.right);
            root.data =IS.data;
            root.right = delete(root.right ,IS.data);
        }
        return root ;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }


    public static void Print_Rnage(Node root , int k1 ,int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            Print_Rnage(root.left, k1, k2);
            System.out.print(root.data+" ");
            Print_Rnage(root.right, k1, k2);
        }
        else if(root.data<k1){
            Print_Rnage(root.left, k1, k2);;
        }
        else{
            Print_Rnage(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {

        int values[] = {4,6,1,3,9};
        Node root = null;
        for(int i= 0 ; i<values.length ;i++){
            root = BST(root, values[i]);
        }        

        Inorder(root);

        System.out.println();

        System.out.println("NODE : ");

        Scanner val = new Scanner (System.in);
        
        int key = val.nextInt();

        if(Search(root,key )){
            System.out.println("Found");
        }
        else{
            System.out.print("Not Found");
        }

        delete(root, 1);
        System.out.println();
        Inorder(root);

        Print_Rnage(root, 1 ,6);

    }
}