//GOOGLE AND MICROSOFT
public class Duplicate_Removal {
    public static void removeduplicates(String str , int idx , StringBuilder newstr , boolean map[]){
        
        //Base case
        if(idx == str.length()){
            System.out.println(newstr);
         return ;
        }


        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //To skip char
            removeduplicates(str, idx+1, newstr, map);
        }


        //To Add char
        else{
            map[currChar-'a']=true;
            removeduplicates(str, idx+1, newstr.append(currChar), map);
        }
    }

    public static void main(String args[]){
        String str =  "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}