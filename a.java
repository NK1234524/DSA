public class a {
    public static void main(String args[]){

        Men m1 = new Men();
        m1.Setnewname("Nishant");
        System.out.println(m1.name);

        Marks m2 = new Marks();
        m2.Setnewmarks(21);
        System.out.println(m2.marks);

        Height h1 =new Height();
        h1.Setnewheight(12);
        System.out.println(h1.height);

        Rollnumber r1 = new Rollnumber();
        r1.Setnewrollnumber(23);
        System.out.println(r1.rollnumber);

        School s1 =new School();
        s1.SetnewSchoolname("MDPS");
        System.out.println(s1.Schoolname);

        date d1= new date();
        d1.Setnewdate(2);
        System.out.println(d1.presentdate);

        Bankpassword b1 = new Bankpassword();
        b1.Username ="Nishant kumar";
        b1.Setnewpassword("Nkj");
        System.out.println("The username is "+b1.Username);     

        Adress a1 = new Adress();
        a1.SetAdress("we");
        System.out.println(a1.getFirstAdress());

        Room e1 = new Room();
        e1.Setnewroom(23);
        System.out.println(e1.getroom());

        location l1 =new location();
        l1.Setnewlocation("Delhi");
        System.out.println("The new location "+l1.getnewlocation());

        //Constructor 
        //name   
        Student w2 = new Student();    
        Student w1 =new Student("Nishant Kumar");
        System.out.println(w1.name);         
        
        //roll
        System.out.println("The roll number is ");  
        w1.roll = 21;  
        w1.date = 20;  
        
        
            Studen t1 = new Studen();
             t1.name="Nishant";
             t1.date = 23;
             t1.Daay = "Monday";
    
            System.out.println("Name "+t1.name);
            System.out.println("date "+t1.date);
            System.out.println("Day "+t1.Daay);   
            
            
        
    }  
}
class Men{
    String name;
    void Setnewname(String newname){
        name =newname;
    }
}
class Marks{
    int marks;
    void Setnewmarks(int newmarks){
        marks =newmarks;
    }
}
class Height{
    int height;
    void Setnewheight(int newheight){
        height = newheight;
    }
}
class Rollnumber{
    int rollnumber ; 
    void Setnewrollnumber(int newrollnumber){
        rollnumber = newrollnumber;
    }
}
class School{
    String Schoolname;
    void SetnewSchoolname(String newSchoolname){
        Schoolname = newSchoolname;
    }
}
class date{
    int presentdate;
    void Setnewdate(int newdate){
        presentdate = newdate;
    }
}
class Bankpassword{
    public String Username;
    private String password; // it would not show password on terminal 
    // If public is used then it will show the password.

    void Setnewpassword(String newpassword){
        password = newpassword;
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
class Room{
    private int room;

    int getroom(){
        return this.room;
    }

    void Setnewroom(int newroom){
        this.room = newroom;
    }
}
class location{
    private String currentLocation;
    String getnewlocation(){
        return this.currentLocation;
    }
    void Setnewlocation(String location){
        this.currentLocation = location;
    }
}
//Encapsulation --> Constructor
class Student {
    String name;
    int roll;
    int date;      
    Student(String name){
        this.name = name;
    }    
    Student(){
        System.out.println("The name is ");
    }      
    
    Student(int roll){
        this.roll = roll;
    }        
}
class Studen{

    String name;
    String Daay;
    int date;

    Studen(){
        this.name = "";
        this.Daay = "";
        this.date = 0;
    }
}

