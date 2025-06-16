public class Bit_types_Operators {
    public static int Ge(int n , int i){//Get ith bit
        int bitmask = 1<<i;
        if((bitmask & n)==0){
            return 0 ; 
        }
        else{
            return 1;
        }
    }
    public static int Se(int n , int i){ // Selection ith bit
        int bitmask = 1<<i;
        return bitmask | n ;
    }
    public static int Clear(int n , int i){  // Clear ith bit
        int bitmask = ~(1<<i);  
        return n & bitmask;        
    }
    //Update ith bit
    public static int update(int n , int i , int newbit){
       
       if(newbit == 0){
        return Clear(n, i);
       }
       else{
        return Se(n, i);
       }
       //For good interview q.
       // n = Clear(n,i);
        //int bitmask = newbit<<1;
        //return n | bitmask ;                
    }
    // Clear last ith bit.
    public static int Clearlastithbit(int n , int i){
        int bitmask = ~(0)<<i;
        return n & bitmask ;
    }
    // Clear range of bits
    public static int ClearIthBits(int n , int i , int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i);
        int bitmask = a | b ;
        return n & bitmask ;
    }
    // Fast exponent
    public static int FastExponent(int n ,int a){
        int ans =1 ;
        while(n>0){
            if((n & 1) !=0){
                ans = ans *5;
            }
            a = a * 5;
            n = n>>1;
        }
        return ans;
     }   
    public static void main(String args[]){
        System.out.println(Ge(10, 2));
        System.out.println(Se(10, 2));
        System.out.println(Clear(10, 1));
        System.out.println(update(10, 2, 1));
        System.out.println(Clearlastithbit(15, 2));
        System.out.println(ClearIthBits(10, 1, 0));
        System.out.println(FastExponent(5, 5));

}
}