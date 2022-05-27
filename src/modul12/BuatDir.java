package modul12;

import java.io.File;

public class BuatDir {
    public static void main(String [] args) {
        if (args.length==0) {System.out.println("Error: tulis nama direktori yang akan dibuat!");}
        String namaDir = args[0];
        File dir = new File (namaDir);
        dir.mkdir();
    }
}
