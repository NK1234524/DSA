public class Strings_CharAT {
    public static void PrintChar(String str){
        for(int i =0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String str =  "Nishant Kumar";
        PrintChar(str);

    }
}
