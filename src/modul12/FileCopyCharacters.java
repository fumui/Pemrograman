package modul12;

import java.io.*;

public class FileCopyCharacters {
    public static void main(String[] args) throws IOException {
        if (args.length<2){ System.out.println("Error: tulis dua nama file!");}

        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader(args[0]);

            outputStream = new FileWriter(args[1]);
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c); }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
