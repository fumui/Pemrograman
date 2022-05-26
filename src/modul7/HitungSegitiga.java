package modul7;

import modul6.Segitiga;

public class HitungSegitiga {
    public static void main (String args[]){
        Segitiga S1 = new Segitiga();
        Segitiga S2 = new Segitiga(10,5);

        S1.setTinggi(12.0);
        S1.setAlas(9.0);

        System.out.println("Tinggi = " + S1.getTinggi());
        System.out.println("Alas = " + S1.getAlas());
        System.out.println("Luas Segitiga = " + S1.getLuas());
        System.out.println();
        System.out.println("Tinggi = " + S2.getTinggi());
        System.out.println("Alas = " + S2.getAlas());
        System.out.println("Luas Segitiga = " + S2.getLuas());
    }
}
