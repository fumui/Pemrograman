package modul12;

import java.io.IOException;

public class ContohOutputStream {
    public static void main(String[] args) throws IOException {
        byte[] data = {'a','b','c','d','e','f','g'};
        System.out.write(data,3,4);
        System.out.write('\n');
        System.out.write(data);
    }
}
