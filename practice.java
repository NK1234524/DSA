public class practice {
    public static int F(int x){
        int ans =x^x;
        return ans;
    }
    public static int S(int a  , int b){

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("the a will be " +a);
        System.out.println("the b will be " +b);
        return a;  
              
    }   
        
    public static void main(String args[]){
       System.out.println(F(3));
       System.out.println(S(2, 4));
       
       int x =2;
       System.out.println(x + " + " + 1 +" is "+ -~x);
       
       for(char ch = 'A' ; ch<='Z';ch++){
        System.out.print((char)(ch | ' '));
       }

    }    
}
