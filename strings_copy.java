public class strings_copy {
    public static void main(String args[]){
        
        String s1 = "Nishant";
        String s2 = "Kumar";
        String s3 = new String("Nishant");

        if(s1.equals(s3)){
            //s1 == s3 considers as a new strings as s3.
            System.out.println("Same string");
        }
        else{
            System.out.println("Not a same string");
        }
    }
    
}
