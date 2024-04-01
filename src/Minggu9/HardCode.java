package Minggu9;
import java.awt.Color;
import javax.swing.JFrame;
public class HardCode {
    public static void main(String[] args) {
        JFrame window1=new JFrame();
        window1.setBackground(new Color(2,1,101));
        window1.setTitle("Aplikasi penjualan sederhana");
        window1.setSize(465, 287);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setLocationRelativeTo(null);
        window1.setVisible(true);
    }
}
