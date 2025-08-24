import java.util.ArrayList;

public class Array_List_mainList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        ArrayList<Integer>List1 = new ArrayList<>();
        ArrayList<Integer>List2 = new ArrayList<>();
        ArrayList<Integer>List3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);

        System.out.println(mainList);

        for(int i=0 ; i<mainList.size();i++){
            ArrayList<Integer>cuArrayList = mainList.get(i);
            for(int j=0;j<cuArrayList.size();j++){
                System.out.print(cuArrayList.get(j)+" ");
            }
            System.out.println();
        }        
    }
}
