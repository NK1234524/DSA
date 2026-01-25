
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
    }
}