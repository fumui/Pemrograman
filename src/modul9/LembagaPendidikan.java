package modul9;

public class LembagaPendidikan {
    public static void main(String args[]){
        University Unpam;
        Unpam = new University(
                "Universitas Pamulang",
                "Jl. Surya Kencana No. 1",
                "+62 21 7412566",
                "Universitas"
        );

        SMA SMAN2 = new SMA(
                "SMAN 2 Kota Tangerang Selatan",
                "Jl. Raya Puspiptek Muncul",
                "+62 21",
                "SLTA");

        System.out.println(
                "Informasi Lembaga Pendidikan :\n" +
                        Unpam.toString()
        );
        System.out.println();
        System.out.println(
                "Informasi Lembaga Pendidikan :\n" +
                        SMAN2.toString()
        );
    }
}
