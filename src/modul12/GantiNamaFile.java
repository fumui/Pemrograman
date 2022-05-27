package modul12;

import java.io.File;

public class GantiNamaFile {
    public static void main(String[] args) {
        if (args.length<2) {System.out.println("Error: tulis nama file lama dan baru!");}
        File berkasSemula= new File(args[0]);
        File berkasBaru = new File(args[1]);
        if (berkasSemula.exists()) {
            if (berkasBaru.exists()) {
                System.out.println("Sudah ada file dengan nama : " + berkasBaru);
            }
            else {
                berkasSemula.renameTo(berkasBaru);
                System.out.println("Nama file " + berkasSemula + " sudah diganti menjadi " + berkasBaru);
            }
        }
        else {
            System.out.println("Nama file " + berkasSemula + " tidak ada");
        }
    }
}
