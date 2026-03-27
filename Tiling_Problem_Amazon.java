//Tilling Problem AMAZON 
public class Tiling_Problem_Amazon {
    public static int Tilingproblem(int n){
        //Base case
        if(n==1 || n==0){
            return 1;
        }
        //Vertical case
        int Vertical = Tilingproblem(n-1);

        //Horizontal case
        int Horizontal = Tilingproblem(n-2);

        int totalways = Vertical+Horizontal;
        return totalways;

    }
//Using Fibonacci series concept.
    public static void main(String args[]){
        System.out.println(Tilingproblem(5));

    }
}