public class Stringfunction_Substring {
    public static void substring(String str , int si , int ei){
        String substr="";
        for(int i =0 ; i<ei ; i++){
            substr+=str.charAt(i);
        }
        System.out.print(substr);
        // return substr; for this we require the string data type fn.
    }
    public static void main(String args[]){
        substring("Nishant", 0, 3);
    }    
}
