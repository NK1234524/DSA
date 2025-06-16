public class Abstract{
    public static void main(String args[]){ 
        Horse myHorse = new Horse();      
        myHorse.walk(); 
        Chicken mychik = new Chicken();
        mychik.walk();  
        //myHorse.changecolour(); Use to provide the colour specific to subclass of parent class Animal.
        System.out.println(myHorse.colour);         
    }
}
abstract class Animal{
    String colour;
    Animal(){ // Constructor
        System.out.println("The animal is a constructor ");
        colour ="Brown";
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolour(){
        colour ="Dark brown";
    }
    void walk(){
    System.out.println("Can walk on 4 legs");
    }
}
class Chicken extends Animal{
    void changecolour(){
        colour = "Grey";
    }
    void walk(){
        System.out.println("Can walk on 2 legs");
    }
}