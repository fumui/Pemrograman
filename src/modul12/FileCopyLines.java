package modul12;

import java.io.*;

public class FileCopyLines {
    public static void main(String[] args) throws IOException {
        if (args.length<2){ System.out.println("Error: tulis dua nama file!");}
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(args[0]));
            outputStream = new PrintWriter(new FileWriter(args[1]));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
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
