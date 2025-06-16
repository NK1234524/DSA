public class Power_recursion{
    public static int Power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*Power(x, n-1);
    }

    //Optimised code but Optimised with log2n timecomplexity.

    public static int Optimisedpower(int x , int n){
        if(n==0){
            return 1;
        }
        int halfpower = Optimisedpower(x, n/2)*Optimisedpower(x, n/2);

        if(n%2!=0){
            halfpower = halfpower*x;
        }
        return halfpower;
    }
    public static void main(String args[]){
      int v  =  Power(2, 5);
      System.out.println(v);
      System.out.println(Optimisedpower(2, 10));

    }
}