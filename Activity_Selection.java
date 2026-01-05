//Here it is sorted time .
import java.util.ArrayList;

public class Activity_Selection {

    public static void main(String args[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxAct = 0 ;

        //1st activity always included as sorted time
        maxAct = 1;
        ans.add(0);
        int lastend = end[0];

        for(int i=1 ;i<end.length ; i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Maximum Activity can be done by a person is : "+maxAct);
        for(int i=0 ;i<=ans.size()-1 ;i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }

}