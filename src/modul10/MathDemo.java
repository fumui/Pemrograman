package modul10;

public class MathDemo {
    public static void main(String args[]) {
        System.out.println("Nilai absolut dari -5 : " + Math.abs(-5));
        System.out.println("Nilai absolut dari 5 : " + Math.abs(-5));
        System.out.println("Nialai random(nilai max : 10) : " + Math.random()*10);
        System.out.println("max dari 3.5 dan 1.2 : " + Math.max(3.5, 1.2));
        System.out.println("min dari 3.5 dan 1.2 : " + Math.min(3.5, 1.2));
        System.out.println("Pembulatan keatas dari 3.3: " + Math.ceil(3.3));
        System.out.println("Pembulatan keatas dari -3.3: " + Math.ceil(-3.3));
        System.out.println("Pembulatan kebawah dari 3.6: " + Math.floor(3.6));
        System.out.println("Pembulatan kebawah dari -3.3: " + Math.floor(-3.3));
        System.out.println("Nilai e : " + Math.E);
        System.out.println("e pangkat 1 : " + Math.exp(1));
        System.out.println("log 10 : " + Math.log(10));
        System.out.println("10 pangkat 3 : " + Math.pow(10,3));
        System.out.println("Nilai pi : " + Math.PI);
        System.out.println("Nilai pembulatan dari pi : " + Math.round(Math.PI));
        System.out.println("Akar kuadrat dari 5 : " + Math.sqrt(5));
        System.out.println("10 radian : " + Math.toDegrees(10) +" degrees");
        System.out.println("sin(90) : " + Math.sin(Math.toRadians(90)));
        System.out.println("cos(180) : " + Math.cos(Math.toRadians(180)));
    }
}
