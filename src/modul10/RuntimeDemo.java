package modul10;

public class RuntimeDemo {
    public static void main(String args[]) {
        Runtime rt = Runtime.getRuntime();
        Process proc;
        try {
            proc = rt.exec("regedit");
        }
        catch (Exception e) {
            System.out.println("regedit is an unknown command.");
        }
    }
}
