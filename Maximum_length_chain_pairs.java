import java.util.*;
public class Maximum_length_chain_pairs {

    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs , Comparator.comparing(o->o[1]));

        int chainLen = 1;

        int chainend = pairs[0][1];

        for(int i= 1 ; i<pairs.length ; i++){
            if(pairs[i][0]>chainend){
                chainLen++;
                chainend = pairs[i][1];
            }
        }

        System.out.println("Chian length is : "+chainLen);

    }
}