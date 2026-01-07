import java.util.Arrays;
import java.util.Collections;

public class Chocola {

    public static void main(String args[]){
        int hp=1 , vp = 1;
    int h=0 ,v= 0;
    int n=4 ,m=6;
    Integer Costhor[]={4,1,2};
    Integer Costver[]={2,1,3,1,4};
    int cost = 0;
    Arrays.sort(Costhor,Collections.reverseOrder());
    Arrays.sort(Costver,Collections.reverseOrder());

    while(h<Costhor.length && v<Costver.length){
      if(Costver[v]<=Costhor[h]){
        cost+=(Costhor[h]*vp);
        hp++;
        h++;
        
      }
      else{
        cost+=(Costver[v]*hp);
        vp++;
        v++;
      }
    }

    while(h<Costhor.length){
      cost+=(Costhor[h]*vp);
      hp++;
      h++;
    }
    while(v<Costver.length){
      cost+=(Costver[v]*hp);
      vp++;
      v++;
    }
    System.out.print("The cost of the chocolate cut :"+cost);
    }
}