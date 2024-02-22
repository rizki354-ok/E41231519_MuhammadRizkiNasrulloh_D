package PenghitungGaji;
import java.util.Scanner;
import java.text.DecimalFormat;
public class KalkulatorGaji {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###");
        System.out.print("Nama karyawan: ");
        String name=scan.nextLine();
        name.toLowerCase();
        System.out.print("Jabatan karyawan: ");
        String role=scan.nextLine();
        System.out.print("Total cuti: ");
        int cuti=scan.nextInt();
        System.out.print("Total jam lembur: ");
        int jamLembur=scan.nextInt();
        scan.nextLine();
        karyawan karyawan1=new karyawan(name,role);
        karyawan1.gaji=hitungGaji(karyawan1.gaji, cuti,jamLembur);
        System.out.println("Gaji "+karyawan1.name+" sebesar "+df.format(karyawan1.gaji));
    }
    static double gajiPerjam(double gaji){
        return gaji/=30;
    }
    static double hitungGaji(double gaji, int cuti, int jamLembur){
        double gajiPokok=gajiPerjam(gaji)*(30-cuti);
        double gajiLembur=(gajiPerjam(gaji)*0.3)*jamLembur;
        return gajiPokok+gajiLembur;
    }
    
}
class karyawan{
    String name;
    String role;
    double gaji;
    static int gaji(String role){
        switch (role) {
        case "programmer":
            return 5000000;
        case "desain grafis":
            return 4000000;
        case "marketing":
            return 3000000;
        case "admin":
            return 2500000;
        default:
            throw new AssertionError();
        }
    }
    public karyawan(String name, String role){
        this.name=name;
        this.role=role;
        this.gaji=gaji(role);
    }
}