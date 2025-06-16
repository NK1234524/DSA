public class Recursions {
    //Recursion
    public static void printDec(int n){
        if(n == 1){
            System.out.print(1);
            return; //Return statement is used to terminate the recursion here.
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void Printinc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }        
        Printincrease(n-1);
        System.out.print(n+" ");
    }
       
    //Function
    public static void printdec(int n){
        for(int i =n;i>=1 ; i--){
            System.out.print(i+" ");
        }
        return ;
    }
    public static void Printincrease(int n){
        for(int i = 0 ; i<=n  ;i++){
            System.out.print(i+" ");            
        }
        return ;
    }

    public static void main(String args[]){
        printDec(10);
        Printinc(10);
    }
}