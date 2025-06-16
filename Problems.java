public class Problems {
    // Question 1: odd even problem
    public static void ODDeven(int n){
        int bitmask =1 ;
        if((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("ODD");
        }
    }
     //Question 2: Power of 2 problem
     public static boolean Power2(int n){
        return (n &(n-1)) ==0;
     }
     //Question 3: Count set bits
     public static int CountSet(int n){
        int count = 0;
        while(n>0){
            if((n & 1) !=0){
                // Check the LSB
                count++;
            }
            n =n>>1;
        }
        return count;
     }
     //Question 4: Find the Fast exponential value 
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
        ODDeven(2);
        ODDeven(11);  
        System.out.println(Power2(8));   
        System.out.println(CountSet(2));   
        System.out.println(FastExponent(5, 5));
    }    
}
