public class Hybrid_Inheritence {
    public static void main(String args[]){
        bird tun = new bird();
        tun.breath();
        tun.wings();
        
        //For including the character of sparrow and pegion we have to
        //sparrow tun = new sparrow(); because it is subclass of birds
        //pegion tun = new pegion(); because it is subclass of birds 
        

    }
    
}
class Animal{
    void breath(){
        System.out.println("Breaths");
    }
}
class mammals extends Animal{
    void hair(){
        System.out.println("have hair");
    }
}
class bird extends Animal{
    void wings(){
        System.out.println("Have wings");
    }
}
class fish extends Animal{
    void fins(){
        System.out.println("Have fins");
    }
}
class shark extends fish{
    void sharpteeth(){
        System.out.println("Have sharpteeth");
    }
}
class Rhoe extends fish{
    void small(){
        System.out.println("Small fish");
    }
}
class sparrow extends bird{
    void beautiful(){
        System.out.println("Beautiful bird");
    }
}
class pegion extends bird{
    void silent(){
        System.out.println("So silent");
    }
}
class horse extends mammals{
    void fast(){
        System.out.println("Runs fast");
    }
}
class girraf extends mammals{
    void tall(){
        System.out.println("Tallest");
    }
}