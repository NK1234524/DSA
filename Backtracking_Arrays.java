public class Backtracking_Arrays{
    public static void Array_Backtracked(int arr[] , int i , int val){
        //Base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //Recursive back case
        arr[i]=val;
        Array_Backtracked(arr, i+1, val+1);//Fn 
        arr[i]=arr[i]-2;//Backtracked       
    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = new int[5];
        Array_Backtracked(arr, 0, 1);
        printArr(arr);
    }
}