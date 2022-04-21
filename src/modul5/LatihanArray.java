package modul5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Byte;

public class LatihanArray {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        Byte JmlData = 0, DataArray[];

        System.out.print("Jumlah data: ");
        try {
            BacaInput = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada kesalahan !");
            System.out.println(e);
        }

        JmlData = Byte.parseByte(BacaInput);
        DataArray = new Byte[JmlData];

        //Membaca data dari keyboard
        System.out.println();
        for (Byte i = 0; i < JmlData; i++) {
            System.out.print("DataArray[" + i + "] = ");

            try {
                BacaInput = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Ada kesalahan !");
            }
            DataArray[i] = Byte.parseByte(BacaInput);
        }
        //Menampilkan data dari array
        System.out.println();
        printArray(DataArray,"DataArray");
        //Mengurutkan array
        Byte[] SortedArr = sortByteArray(DataArray);
        System.out.println();
        System.out.println("Array yang sudah terurut: ");
        printArray(SortedArr,"SortedArr");

        System.out.println();
        System.out.println("nilai terkecil: "+ SortedArr[0]);
        System.out.println("nilai terbesar: "+ SortedArr[JmlData-1]);
    }
    /***
     * sortByteArray mengurutkan angka secara menaik (ascending)
     * @param arr: array yang akan diurutkan
     * @return array yang sudah terurut
     */
    private static Byte[] sortByteArray(Byte[] arr){
        for (int i = 1; i < arr.length; i++){
            int curr = i;
            int prev = curr - 1;
            while (prev > -1 && arr[curr] < arr[prev]){
                Byte temp = arr[curr];
                arr[curr] = arr[prev];
                arr[prev] = temp;
                curr--;
                prev--;
            }
        }
        return arr;
    }
    /***
     * printArray mencetak isi setiap elemen array pada tiap baris console
     * format cetak -> arrayName[index] = value
     * @param arr: array yang akan dicetak
     * @param arrayName: nama array yang akan dicetak
     * @param <T>: semua tipe kompleks yang siap ditampilkan dalam console
     */
    private static <T> void printArray(T[] arr, String arrayName){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arrayName + "[" + i + "] = " + arr[i]);
        }
    }
}