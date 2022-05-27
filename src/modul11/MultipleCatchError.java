package modul11;

public class MultipleCatchError {
    public static void main(String args[]){
        try {
            int a = Integer.parseInt(args [0]);
            int b = Integer.parseInt(args [1]);
            System.out.println(a/b);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("After try-catch-catch.");
    }
}
