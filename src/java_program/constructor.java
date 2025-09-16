package java_program;

public class constructor {
    public static void main(String args[]){
        Student s1=new Student("Ankit kumar");
        System.out.println(s1.name);
        Student s2=new Student(2456);
        System.out.println(s2.roll);
    }
}
class Student{
String name;
int roll;
Student(){                                                              // This is constructor.....
System.out.println("Constructor is passed...");                        // It is not parameterized Constructor
  }                                                                        

Student(String name){                                                        // It is Parameterized Constructor....
    this.name=name;                                                                
} 
Student(int roll){
    this.roll=roll;
}
}