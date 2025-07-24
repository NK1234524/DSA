public class practice {
    public static void Sub(String str , int i , String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print(ans+ ".");
            }
          System.out.print(ans+" ");
           return;
        }       
        Sub(str,i+1,ans+str.charAt(i));
        Sub(str,i+1,ans);
    }        
   public static void main(String[] args) {
       String str = "abc";
       Sub(str, 0, "");
   }
}