//Deep copy
public class Deep_copy_shallow_copy{
    public static void main(String args[]){
        //s1
        Student s1 = new Student("nishant " , 20);
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        //s2
        
        Student s2 =new Student(s1);
        s1.marks[2]=100;

        System.out.println(s1.name + s1.age);
        
        for(int i = 0 ;i<3 ; i++){
            System.out.println(s1.marks[i]);
        }     
        
        
        System.out.println(s2.name + s2.age);
        
        for(int i = 0 ;i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name ;
    int age;
    int marks[];

    Student(String name , int age){        
        this.name =name;
        this.age =age;
        this.marks=new int[3];//index value
    }
    
    //Shallow copy
   // Student(Student s){
      //  this.name =s.name;
      //  this.age =s.age;
      //  this.marks=s.marks;
    //}

    //Deep copy
    Student(Student s){
        this.name =s.name;
 this.age =s.age;
       this.marks=new int[3];
      for(int i = 0 ;i<3 ; i++){
       this.marks[i] =s.marks[i];
      }
    }
}