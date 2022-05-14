package modul14;

import javax.net.ssl.*;
import java.io.*;
import java.net.*;

public class Downloader {
    public static void main(String[] args) {
        //buat trust manager kosong supaya mempercayai sembarang sertifikat SSL
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) { }
                }
        };
        // aktifkan trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // kode untuk men-download file
        try{
            URL url = new URL(args[0]);
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            File targetFile = new File(args[1]);
            OutputStream outStream = new FileOutputStream(targetFile);
            outStream.write(is.readAllBytes());
            outStream.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
