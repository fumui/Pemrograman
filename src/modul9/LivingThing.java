package modul9;

abstract class LivingThing{
    public void breath(){
        System.out.println("Bernafas melalui hidung.");
    }
    public void eat(){
        System.out.println("Makan melalui mulut.");
    }
    public abstract void walk();
}