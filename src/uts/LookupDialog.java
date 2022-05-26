package uts;
import javax.swing.*;
public class LookupDialog {
    public static void main(String[] args) {
        String nama;
        Biodata output = new Biodata(),
                fuad = new Biodata(
                                "Fuad Mustamirrul Ishlah",
                                "04TPLE005",
                                "Tawangsari RT/RW 001/003, Kec Wonosobo, Kab Wonosobo, Jawa Tengah",
                                "Teknik Informatika",
                                4);
        Biodata daftarBiodata[] = {fuad};
        nama = JOptionPane.showInputDialog("Ketik nama anda :");
        for (Biodata biodata: daftarBiodata) {
            if(biodata.nama.equals(nama)){
                output = biodata;
                break;
            }
        }
        if (!output.nama.equals("")){
            JOptionPane.showMessageDialog(null,output.getPrintableString());
            System.out.println(output.getPrintableString());
        } else {
            JOptionPane.showMessageDialog(null,"Maaf, nama tidak ada dalam daftar");
        }
    }
    private static class Biodata {
        String nama, kelas, alamat, prodi;
        int semester;
        Biodata(){ }
        Biodata(String nama, String kelas, String alamat, String prodi, int semester){
            this.nama = nama;
            this.kelas = kelas;
            this.alamat = alamat;
            this.prodi = prodi;
            this.semester = semester;
        }
        public String getPrintableString(){
            return "Nama\t: "+this.nama+"\nKelas\t: "+this.kelas+"\nAlamat\t: "+this.alamat+"\nProdi\t: "+this.prodi+"\nSemester\t: "+this.semester;
        }
    }
}
