package modul12;

import java.io.File;

public class ListDir {
    public static void main(String[] args) {
        String namaDir = ".";

        File dir = new File(namaDir);
        String dafFile[] = dir.list();
        for (int i=0; i < dafFile.length; i++)
            System.out.println(dafFile[i]);
    }
}
