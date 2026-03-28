public class Spiral_Matrix {
    public static void Spiral(int matrix[][]){
        int startcol=0,startrow=0,endrow=matrix.length-1,endcol=matrix[0].length-1;
        while(startcol<=endcol && startrow<=endrow){
            //Top
            for(int i = startcol ; i<=endcol ; i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            //Right
            for(int j = startrow+1 ; j<=endrow ; j++ ){
                System.out.print(matrix[j][endcol]+" ");
            }
            //Bottom
            for(int i = endcol-1 ; i>=startcol ; i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][i]+" ");
            }
            //Left
            for(int j =endrow-1 ; j>=startrow ; j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[j][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }      
        System.out.println(); 
      }
      //Digonal sum of spiral matrix.
      public static int printdigonalsum(int matrix[][]){   
            int sum =0 ;       
            for(int i =0 ; i<matrix.length;i++){
                for(int j =0 ; j<matrix[0].length;j++){
                    if(i==j){
                        sum+=matrix[i][j];
                    }
                    else if(i+j == matrix.length-1){
                        sum+=matrix[i][j];
                    }

                }
            }
            int Digonalsum = sum;
            System.out.println("Diagonal sum is "+Digonalsum);
            return sum;
        }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(matrix);
        printdigonalsum(matrix);
    }    
}
