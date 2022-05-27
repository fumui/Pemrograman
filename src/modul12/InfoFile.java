package modul12;

import java.io.*;

public class InfoFile {
    public static void main(String[] args){
        BufferedReader StreamTeks=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Masukan nama file:");
        String namaBerkas = "";
        try {
            namaBerkas = StreamTeks.readLine();
        } catch (IOException i){
        }

        File berkas = new File(namaBerkas);
        if (!berkas.exists()){ System.out.println("Berkas ini tak ada");}
            if (berkas.isDirectory()) System.out.println("Direktori");
            if (berkas.isFile()) System.out.println("Berkas biasa");
            if (berkas.isHidden()) System.out.println("Tersembunyi");
            if (berkas.canRead()) System.out.println("Bisa dibaca");
            if (berkas.canWrite()) System.out.println("Bisa ditulisi");
            if (berkas.isAbsolute()) System.out.println("path absolut");
            else System.out.println("path relatif");

            System.out.println("Induk : " + berkas.getParent());
            System.out.println("Path : " + berkas.getPath());
            System.out.println("Path Absolut : " + berkas.getAbsolutePath());
            System.out.println("Nama : " + berkas.getName());
            System.out.println("Ukuran : " + berkas.length() +" byte");
        }
}
