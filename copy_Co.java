public class copy_Co {
    public static void main(String args[]){
        Student s1 = new Student("Nishant ",20);
        Student s2 = new Student(s1);
        
        System.out.println(s1.name +s1.age);
        System.out.println(s2.name +s2.age);
    }
}

    
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}
