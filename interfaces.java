public class interfaces{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatsg();
        b.eatsm();
    }
}
interface Herbivores{  //Total abstraction is here 
    void eatsg();//That's why only function is mentioned but defined in class.
}
interface carnivores{
    void eatsm();
}
class Bear implements Herbivores,carnivores{  //Multiple inheritence is present
    public void eatsg(){//Because of interface public is implemented here.
        System.out.println("Eats grass");
    }
    public void eatsm(){ //Because of interface public is implemented here.
        System.out.println("Eats maeat");
    }
}
