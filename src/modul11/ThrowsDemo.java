package modul11;

public class ThrowsDemo {
    public static void main(String args[]) {
        try {
            ThrowingClass.myMethod();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
