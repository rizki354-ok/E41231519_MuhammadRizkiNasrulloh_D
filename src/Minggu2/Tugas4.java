package Minggu2;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        String nama;
        int pilihan;
        Scanner scan=new Scanner(System.in);
        System.out.print("""
                    CAFE CERIA
                  ANEKA MINUMAN
--------------------------------------------------
                  SPECIAL MENU :
                 1. Soft drinks
                 2. Mix juice
                 3. Nescafe
                 4. Soda milk
                 5. Tea
--------------------------------------------------
Masukkan nama pembeli :""");
        nama=scan.nextLine();
        System.out.print("\n");
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan=scan.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Angka yang dimasukkan salah!");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.printf("Terima Kasih %s telah berkunjung di Cafe Ceria\n", nama);
    }
}
