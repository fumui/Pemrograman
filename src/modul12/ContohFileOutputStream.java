package modul12;

import java.io.*;

public class ContohFileOutputStream {
    public static void main(String[] args) {
        if (args.length==0) {System.out.println("Error: tulis nama file!");}
        byte data;
        FileOutputStream fout=null;
        try {
            fout = new FileOutputStream(args[0]);
            System.out.println ("Ketik data yang ingin Anda tulis ke file. Ketik \"Q\" untuk mengakhiri");
            data = (byte)System.in.read();
            while (data != (byte)'Q') {
                fout.write(data);
                data = (byte) System.in.read();
            }
        } catch(FileNotFoundException e) {
            System.out.println("file : " + args[0] + " tidak dapat dibuka atau dibuat.");
        } catch(IOException e) {
            System.out.println("Ekspresi tidak diketahui : " + e);
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch(IOException err) {
                    System.out.println("Ekspresi tidak diketahui : " + err);
                }
            }
        }
    }
}
