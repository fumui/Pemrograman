package modul14;
import java.io.*;
import java.net.*;
import java.io.InputStream;
import java.io.OutputStream;
public class MyClient {
    public static void main(String args[]) {
        try {
            Socket client = new Socket(InetAddress.getLocalHost(),1234);
            //Socket client = new
            new Socket(InetAddress.getByName("127.0.0.1"),1234);

            InputStream clientIn = client.getInputStream();
            OutputStream clientOut = client.getOutputStream();
            PrintWriter pw = new PrintWriter(clientOut, true);

            BufferedReader br = new BufferedReader(new
                    InputStreamReader(clientIn));
            BufferedReader stdIn = new BufferedReader(new
                    InputStreamReader(System.in));
            System.out.println("Type a message for the server: ");
            pw.println(stdIn.readLine());
            System.out.println("Server message: ");
            System.out.println(br.readLine());

            pw.close();
            br.close();
            client.close();
        } catch (ConnectException ce) {
            System.out.println("Cannot connect to the server.");
        } catch (IOException ie) {
            System.out.println("I/O Error.");
        }
    }
}