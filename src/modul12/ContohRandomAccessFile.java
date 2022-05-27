package modul12;

import java.io.*;

public class ContohRandomAccessFile {
    public static void main(String [] args) throws IOException {
        RandomAccessFile berkas = new RandomAccessFile("latihan.txt", "rw");
        berkas.writeBytes("ABCDEFGHIJKLMNOPQRSTUVW");
        char kar = ' ';

        berkas.seek(0); System.out.println("isi berkas: ");
        while(berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte(); System.out.print(kar);
        }
        System.out.println();

        berkas.seek(3); berkas.writeByte((int)'z');
        System.out.println("Sesudah penggantian");
        berkas.seek(0); System.out.println("isi berkas: ");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte(); System.out.print(kar);
        }
    }
}
