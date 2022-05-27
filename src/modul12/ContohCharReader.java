package modul12;

import java.io.*;

public class ContohCharReader {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ketik sejumlah karakter, akhiri dengan \"Q\"");
        data =(char) br.read();
        while (data != 'Q') {
            str += data;
            data = (char) br.read();
        }
        System.out.println("Karakter yang anda ketik : " + str);
    }
}
