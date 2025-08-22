import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]){
         ArrayList<Integer>list = new ArrayList<>();
         list.add(11);
         list.add(21);
         list.add(33);
         list.add(24);
         list.add(95);
         list.add(60);
         System.out.println(list);
         Collections.sort(list);
         System.out.println(list);
    }
}