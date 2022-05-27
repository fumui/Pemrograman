package modul12;

import java.io.*;

public class ContohLineReader {
    public static void main(String[] args) {
        String str, hasil = "";
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Ketik sejumlah string dan akhiri dengan KELUAR");
        try{
            str = br.readLine();
            while (!str.equals("KELUAR")){
                hasil += str + '\n';
                str = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("String yang anda ketik: " + hasil);

    }
}
