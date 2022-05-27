package modul11;

public class AgeAssert {
    public static void main(String args[]) {
        int age = Integer.parseInt(args[0]);
        assert(age>0);
        System.out.println("age: "+age);
        if (age >= 18) {
            System.out.println("Congrats! You're an adult!");
        }
    }
}
