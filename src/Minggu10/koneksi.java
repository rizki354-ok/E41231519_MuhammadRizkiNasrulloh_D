package Minggu10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static Statement konek() {
        try {
            String url="jdbc:mysql://localhost/penjualan";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            return stm=con.createStatement();
        } catch (Exception e) {
            System.out.println("Koneksi gagal "+e.getMessage());
            return stm=null;
        }
    }
}