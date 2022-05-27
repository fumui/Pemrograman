package modul12;

import java.io.*;

public class ContohFileInputStream {
    public static void main(String[] args) {
        if (args.length == 0) { System.out.println("Masukkan nama file sebagai parameter!"); }
        byte data;
        FileInputStream fin=null;
        try {
            fin = new FileInputStream(args[0]);
            do {
                data = (byte) fin.read();
                System.out.print((char)data);
            } while(data != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File: " + args[0] + "tidak ditemukan.");
        } catch(IOException e) {
            System.out.println("Ekspresi tidak diketahui : " + e) ;
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch(IOException err) {
                    System.out.println("Ekspresi tidak diketahui : " + err);
                }
            }
        }
        }
    }
