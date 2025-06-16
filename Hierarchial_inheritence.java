public class Hierarchial_inheritence {
    public static void main(String args[]){
        bird tan =new bird();
        tan.breath();
        tan.wings();
        

    }    
}

class Animal{

    void breath(){
        System.out.println("Breaths");
}
}

class mammal extends Animal{

    void hair(){
        System.out.println("Have hair");
    }
}

class bird extends Animal{
    void wings(){
        System.out.println("Have wings");
    }
}