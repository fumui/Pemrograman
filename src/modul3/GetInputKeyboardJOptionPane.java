package modul3;
import javax.swing.JOptionPane;

public class GetInputKeyboardJOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Ketik nama anda: ");
        String msg = "Hello "+nama+" \nLanjutkan belajar programming";
        JOptionPane.showMessageDialog(null, msg);
    }
}
