package modul3;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

import java.io.*;

public class CobaReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        System.out.println("Ketik nama anda: ");
        try {
            nama =  dataIn.readLine();
        } catch (IOException e){
            System.out.println("Ada kesalahan: "+ e.getMessage());
        }

        System.out.println();
        System.out.println("Hello "+nama);
        System.out.println("Lanjutkan belajarnya menjadi programmer java ya");
    }
}
