public class Array_Sorted {
    public static Boolean sorted(int arr[], int i){
        if(i==arr.length-1){// Base case
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);
    }

    public static void  main(String args[]){
        int arr[]= {2,3,4,6};
        System.out.print(sorted(arr, 0));
    }
}