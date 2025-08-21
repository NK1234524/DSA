import java.util.*;
public class Introduction{
    public static void main(String args[]){
        ArrayList<Integer>List = new ArrayList<>();
       //Add
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.println("The Array List is : "+List);
    //    //Get
    //    int element = List.get(3);
    //    System.out.println("The element of an index is : "+element);

    //    //Remove
    //    int element_remove = List.remove(3);
    //    System.out.println("The removed element is : "+element_remove);
    //    System.out.println(List);

       //Set
       List.set(4,10);
       List.set(2,20);
       System.out.println(List);
    }
}