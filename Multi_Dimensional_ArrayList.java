import java.util.*;
public class Multi_Dimensional_ArrayList {

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList = mainList.get(i);
            for(int j =0 ;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}