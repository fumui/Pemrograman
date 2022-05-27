package modul11;

public class NestedTryDemo2 {
    static void nestedTry(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Error, pembagi bernilai nol!");
        }
    }

    public static void main(String args[]){
        try {
            nestedTry(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dibutuhkan dua parameter/argument!");
        }
    }
}
