package modul12;

import java.io.*;

public class ContohFileReader {
    public static void main (String args[]) {
        if (args.length==0) {System.out.println("Error: tulis nama file!");}
        String data;
        BufferedReader br = null;
        try {
            Reader fin = new FileReader(args[0]);
            br = new BufferedReader(fin);
            do {
                data = br.readLine();
                System.out.println(data);
            } while(data != null);
        } catch(FileNotFoundException e) {
            System.out.println("File : " + args[0] + "tidak ditemukan.");
        } catch(IOException e) {
            System.out.println("Ekspresi tidak diketahui : " + e);
        } finally {
            if (br != null) {
                try {
                    br.close();} catch(IOException err) {
                    System.out.println("Ekspresi tidak diketahui : " +err);
                }
            }
        }
    }
}
