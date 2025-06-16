public class static_keyword {
    public static void main(String args[]){
        Student s1  = new Student();
        s1.schoolname="MDPS";
        
        Student s2 = new Student();
        System.out.println(s2.schoolname);      
    }    
}
class Student{
    String name;
    int roll;
    static String schoolname; // Becasue od static only the names for s1 and s2 is same itself.


    void setname(String name){
        this.name =name;
    }  
    String getname(){
        return this.name;
    }
}
