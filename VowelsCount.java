import java.util.*;
public class VowelsCount {
    public static void main(String args[]){
        int vowelCount=0;
        System.out.println("Enter the string here");
        Scanner val = new Scanner(System.in);
        String str = val.nextLine();
        for(int i = 0 ; i<str.length() ;i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
        }
        System.err.println("The vowels in the "+str+" is "+vowelCount);
    }
}