
import java.util.ArrayList;
import java.util.Scanner;

public class Swap {

    public static void main(String args[]){
        ArrayList<Integer>List = new ArrayList<Integer>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List);
        
        Scanner val = new Scanner(System.in);
        int idx1= val.nextInt() ,idx2=val.nextInt() ;
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);
        System.out.println(List);
    }
}