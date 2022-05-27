package modul14;

import java.io.*;
import java.net.*;

public class EchoingServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket client;
        try {
            server = new ServerSocket(1234);
            //1234 nomor port yang belum digunakan
        } catch (IOException ie) {
            System.out.println("Cannot open socket.");
            System.exit(1);
        }
        char ch;
        String InSt = "";

        while (true) {
            try {
                client = server.accept();
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                String St = br.readLine();
                pw.println("Dari Server : " + St + InSt);
                System.out.println(St);
            } catch (IOException ie) {
            }
        }
    }
}
