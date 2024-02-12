package Minggu2;
import java.util.Scanner;
public class Tugas3v2 {
    public static void main(String[] args) {
        String nama;
        int total = 0, harga;
        Scanner scan = new Scanner(System.in);
        System.out.print("""
-------------------------------------------------------------------------
                    Kharisma Agung Plaza < KAP >                         
                      Promo Belanja Berhadiah                            
                 Khusus Pembelian 5 Barang Pertama                       
                  Dengan harga minimum Rp 10000,00                       
-------------------------------------------------------------------------\n""");
        System.out.print("Masukkan nama pembeli: ");
        nama = scan.nextLine();
        int hitung=0;
        System.out.print("\n");
        for (int i = 1; i > 0; i++) {
            System.out.print("Masukkan harga barang ke-" + i + "\t: ");
            harga = scan.nextInt();
                if (harga >= 10000) {
                    ++hitung;
                }
            if (harga == 0) {
                break;
            }
            total += harga;
        }
        System.out.printf("Total harga pembelian atas nama %s adalah Rp %d\n\n", nama, total);
        if (hitung>=5) {
            System.out.println("Selamat....\nAnda mendapat hadiah 1 buah mug cantik\n");
        } else {
            System.out.println("                                                                         ");
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                               Terima Kasih                              ");
        System.out.println("                Anda sudah belanja di Kharisma Agung Plaza               ");
    }
}
