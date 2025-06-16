public class shortestpath{
    public static int getshortestpath(String path){
        int x = 0 ;int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
       int result =(int) Math.round(Math.sqrt(x*x +y*y));
        return result;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest path is : "+getshortestpath(path));        
    }
}