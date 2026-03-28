import java.util.*;
public class Two_DArrays {
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        //rows n 3
        //cols m 3
        int n = matrix.length;
        int m = matrix.length;
//Input
        for(int i =0 ; i<n ; i++){//rows
            for(int j =0 ; j<m ; j++){
                Scanner val = new Scanner(System.in);
                matrix[i][j]=val.nextInt();
            }
        }
        System.out.println("Here is my Matrix");
//Output        
 for(int i =0 ; i<n ; i++){//rows
            for(int j =0 ; j<m ; j++){
                System.out.print(matrix[i][j]+" ");
              
            }
            System.out.println();
        }

    }
    
}
