package modul12;

import java.io.File;

public class HapusFile {
    public static void main(String[] args) {
        if (args.length==0) {System.out.println("Error: tulis nama file yang akan dihapus!");}

        String namaFile = args[0];

        File berkas = new File (namaFile);
        if (berkas.exists()) {
            System.out.println("Berkas " + namaFile + " ada");

            berkas.delete();

            System.out.println("Setelah penghapusan....");
            if (berkas.exists()) System.out.println("Berkas " + namaFile + " ada");
            else System.out.println("Berkas " + namaFile + " sudah dihapus");
        }
        else {
            System.out.println("Berkas " + namaFile + " tidak ada");
        }
    }
}
