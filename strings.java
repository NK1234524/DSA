import java.util.Scanner;

public class strings{
    public static void main(String args[]){
        Scanner val = new Scanner(System.in);
      // String name = val.next();
       // System.out.println(name);
       String name = "Nishant Kumar";
        String newname = val.nextLine();
        System.out.println(newname);
       String  n = name + newname;
       System.out.println(n+" ");
       System.out.println("The length is "+n.length());
       


    }
}