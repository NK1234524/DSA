public class Sum {

    public static int sumn(int n){
        if(n==1){
            return 1 ;
        }
        int sumnm1 = sumn(n-1);
        int sum = n+sumn(n-1);
        return sum;
    }

    public static void main(String args[]){
        
        int v =sumn(5);
        System.out.print(v);
    }
}