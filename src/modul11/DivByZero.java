package modul11;

class DivByZero {
    public static void main(String args[]) {
        try {
            System.out.print("3/0 = ");
            System.out.println(3/0);
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }
        System.out.println("Setelah Exception.");
    }
}