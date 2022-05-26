package modul8;

public class Employee extends Person{
    Employee(){
        System.out.println("Inside Employee:Constructor");
    }
    Employee(String name, String address){
        super( name, address );
        System.out.println("Inside Employee:Constructor");
    }
    public String getName(){
        System.out.println("Employee: getName");
        System.out.println("Employee Name: " + name);
        return name;
    }
}
