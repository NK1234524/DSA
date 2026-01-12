public class Quick_sort{
    public static void Printarr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Quick_sort(int arr[], int si , int ei){

        if(si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
            Quick_sort(arr, si, pIdx-1);
            Quick_sort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[],int si , int ei ){
        int pivot = arr[ei];
        int i = si-1;   

        for(int j=si ; j<ei ;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp = arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String args[]){
        int arr[]={3,2,1,7,4,8};
        Quick_sort(arr, 0, arr.length-1);
        Printarr(arr);
    }
}