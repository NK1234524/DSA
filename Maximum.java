import java.util.ArrayList;
public  class Maximum {

    public static void main(String args[]){

        ArrayList<Integer>List = new ArrayList<Integer>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.print(List);
           int max = List.get(0);
        for(int i = 0 ;i <List.size() ; i++){
            if(List.get(i)>max){
                max = List.get(i);
            }
        }
        System.out.println("The maximum element of an array is "+max);

    }

    
}