public class OOPS {
    public static void main(String args[]){
        Pen p1 =new Pen(); 
        p1.setcolour("Blue");
        System.out.println(p1.pencolour);
        p1.setsize(23);
        System.out.println(p1.tipsize);

        Men m1 =new Men();
        m1.setname("Nishant");
        System.out.println(m1.name);

        height h1 = new height();
        h1.setheight(23);
        System.out.println(h1.heightw);

        Marks M1 = new Marks();
        M1.Setmarks(25);
        System.out.println(M1.marks);

        Bankpassword b1 =new Bankpassword();
        b1.Username="Nishant Kumar";        
        b1.Setnewpassword("This is password: as"); // Can only change by public modifier.

        Adress a1 = new Adress();
        a1.SetAdress("we");
        System.out.println(a1.getFirstAdress());

        Student w1 =new Student();
       //Student w1 =new Student("Nishant");

       Studen s1 = new Studen();
       s1.name="Nishant";
       s1.dat = 23;
       s1.Daay = "Monday";

       System.out.println("Name "+s1.name);
       System.out.println("date "+s1.dat);
       System.out.println("Day "+s1.Daay);

       //INHERITECNE

       fish Shark = new fish();       
       Animal lion =new Animal();      
       Shark.fins();        
       lion.eat();
    }    
}

class Pen{

    String pencolour ;
    int tipsize;

    void setcolour(String newcolour){
        pencolour = newcolour;
    }
    void setsize(int newsize){
        tipsize = newsize;
    }
}

class Men{

    String name;

    void setname(String newname){
        name = newname;
    }
}

class height{

    int heightw;

    void setheight(int  newheight){
        heightw = newheight;
    }
}

class Marks{
    int marks ;
    void Setmarks(int newmarks){
        marks = newmarks;
    }
}

class Bankpassword{
    public  String Username;
    private String password; // we here can use default modifier also but it would create space to change the password.

   public  void Setnewpassword(String pwd){
        pwd =password;
    }    
}

class Adress{
    private String FirstAdress;
    String getFirstAdress() { //Here we can not directly enter the value of Firstadress(Private modifier is used).
        return this.FirstAdress;
    }
    void SetAdress(String newAdress){
        this.FirstAdress = newAdress;
    }     
}

//Encapsulation --> Constructor
class Student {
    String name;
    int roll;
 //Here the Student is the constructor also this is used instead return 
    Student(){
        System.out.println("The correct name is: ");
    }
    /*Student(){
     * this.name =name;
    } */

}
class Studen{

    String name;
    String Daay;
    int dat;

    Studen(){
        this.name = "";
        this.Daay = "";
        this.dat = 0;
    }
}
class Animal{
    String name;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}

class fish{
    String name;
    void fins(){
        System.out.println("Can swim");
    }
    void water(){
        System.out.println("Can live in water");
    }
}
