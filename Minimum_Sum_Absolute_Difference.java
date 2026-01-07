import java.util.*;
public class Minimum_Sum_Absolute_Difference {

    public static void main(String args[]){
        int A[]={1,2,3};
        int B[]={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int absolute_Sum = 0;
        for(int i = 0 ; i<A.length ;i++){
            absolute_Sum=Math.abs(A[i]-B[i]);
        }
        System.out.println(absolute_Sum);
    }
}