public class Multi_level_Inheritence {

    public static void main(String args[]){
        dogs galaxy = new dogs();
        galaxy.hair();
        galaxy.eat();
        galaxy.breath();
        galaxy.legs();
    }
}
//broader level
class Animal{
    void eat(){
        System.out.println("Eat food");
    }
    void breath(){
        System.out.println("Breath");
    }
}
//Subordinate level
class mammal extends Animal{
    void legs(){
        System.out.println("have legs");
    }
    
}
//Supersuboordinate level

class dogs extends mammal{
    void hair(){
        System.out.println("Have hair");
    }
}