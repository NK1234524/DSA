public class Rotated_array_Search {
    public static int search(int arr[], int target , int si , int ei){
        //Base case
        if(si>ei){ //Depicts when no any element left in an array.
            return -1;
        }
        int mid = si+(ei-si)/2;
        //To calculate the mid value
        if(arr[mid]==target){
            return mid;
        }


        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a :Left
            if(arr[si]<=target && target<arr[mid]){
                return  search(arr, target, si, mid-1);
            }
            else{
            //case b :Right
            return search(arr, target,mid+1, ei);        
            }
        }


        //mid on L2
        else{
            //case c :Right
            if(arr[mid]<target && target <=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //case d :Left
            else{
                return search(arr, target, si, mid-1);
            }

            
        }
    }
    public static void main(String args[]){
int arr[]={4,5,6,7,0,1,2};
int target = 0;
int targetidx = search(arr, target, 0, arr.length-1);
System.out.println(targetidx);
    }
    
}
