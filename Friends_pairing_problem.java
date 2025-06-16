//godlman sachs
public class Friends_pairing_problem{
    public static int firstpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        /*int fnm1 = firstpairing(n-1);
        int fnm2 = firstpairing(n-2);
        int pairways = (n-1)*fnm2;
        int totalways = fnm1 + pairways;
        return totalways;*/
        return firstpairing(n-1)+firstpairing(n-2)*(n-1); //DP
    }

    public static void main(String args[]){
        int v = firstpairing(5);
        System.out.println(v);
    }
}