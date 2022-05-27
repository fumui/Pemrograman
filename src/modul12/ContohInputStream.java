package modul12;

import java.io.IOException;

public class ContohInputStream {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Ketik 10 buah karakter:");
        System.in.read(data);

        System.out.println("Karakter yang anda ketik adalah:");
        for(int i=0; i<data.length; i++){
            System.out.print((char) data[i]);
        }
    }
}
