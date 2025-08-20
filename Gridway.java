public class Gridway {
    public static int grid_ways(int x ,int y ,int m , int n){
        if(x==m-1 && y==n-1){
            return 1;
        }
        if(x==n || y==m){
            return 0;
        }
        int w1 = grid_ways(x+1, y, m, n);
        int w2 = grid_ways(x, y+1, m, n);

        return w1+w2;
    }
        public static void main(String args[]){

           int result = grid_ways(0, 0, 3, 3);
           System.out.println("Total gridways here: "+result);
            
        
    }
}