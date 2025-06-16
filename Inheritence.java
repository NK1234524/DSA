public  class Inheritence{
    public static void main(String args[]){
        fish shark = new fish();
        shark.eats();
        //shark.fins();
    }
}
class Animal{
    String colour;

    void eats(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

class fish extends Animal{

    String name;

    void fins(){
        System.out.println("Can swim");
    }
}