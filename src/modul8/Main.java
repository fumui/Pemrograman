package modul8;

public class Main {
    public static void main( String[] args ){
        Person ref;
        Student studentObject = new Student("fuad","tangsel");
        Employee employeeObject = new Employee("fumui","wonosobo");

        System.out.println();
        System.out.println("print langsung di main:");
        ref = studentObject; //Person menunjuk kepada object Student
        String temp = ref.getName(); //getName dari Student class dipanggil
        System.out.println( temp );
        System.out.println();
        ref = employeeObject; //Person menunjuk kepada object Employee
        temp = ref.getName(); //getName dari Employee class dipanggil
        System.out.println( temp );

        System.out.println();
        System.out.println("print menggunakan fungsi printInformation:");
        printInformation(studentObject);
        System.out.println();
        printInformation(employeeObject);
    }
    public static void printInformation( Person p ){
        System.out.println("Name: "+p.getName());
        System.out.println("Address: "+p.getAddress());
    }
}
