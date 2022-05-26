package modul8;

public class Student extends Person{
    public Student(){
        super();
        System.out.println("Inside Student:Constructor");
    }
    public Student(String name, String address){
        super( name, address );
        System.out.println("Inside Student:Constructor");
    }
    public String getName(){
        System.out.println("Student: getName");
        System.out.println("Student Name: " + name);
        return name;
    }

}
