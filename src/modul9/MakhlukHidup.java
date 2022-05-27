package modul9;

public class MakhlukHidup {
    public static void main(String args[]){
        Human Manusia = new Human();
        Cat Kucing = new Cat();

        System.out.println("Manusia :");
        Manusia.breath();
        Manusia.eat();
        Manusia.walk();

        System.out.println();

        System.out.println("Kucing :");
        Kucing.breath();
        Kucing.eat();
        Kucing.walk();
    }
}
