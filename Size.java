import java.util.ArrayList;
public class Size{
    public static void main(String args[]){
        ArrayList<Integer>List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(List);

        System.out.println("The size of an array is : "+List.size());

        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
System.out.println();
//Reverse an array
        for(int i = List.size()-1 ; i>=0 ; i--){
            System.out.print(List.get(i)+" ");
        }
    }
}