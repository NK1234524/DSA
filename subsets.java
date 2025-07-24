class subsets{
    public static void SUBSET(String str , int i , String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print(".");
            }
            else{
                System.out.print(ans+" ");
            }
            return;
        }
        SUBSET(str, i+1, ans+str.charAt(i));
        SUBSET(str, i+1, ans);       
    }
    public static void main(String args[]){
           String str = "abc";
           SUBSET(str, 0, "");

    }
}