package modul4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PernyataanIfElse2 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader(new
                InputStreamReader(System.in));
        String gradestring = "";
        Byte grade = 0;

        System.out.print("Ketik nilai Anda : ");
        try{
            gradestring = dataIn.readLine();
        }
        catch( IOException e ){
            System.out.println("Ada kesalahan !");
        }
        grade = new Byte (gradestring);

        if ( grade >= 80 ) {
            System.out.println("Selamat Anda Lulus!");
            System.out.println("Karena nilai Anda "+grade+"!");
        }
        else {
            System.out.println("Maaf Anda Belum Lulus!");
            System.out.println("Karena nilai Anda "+grade+"!");
        }
    }
}
