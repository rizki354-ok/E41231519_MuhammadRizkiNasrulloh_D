package Minggu3;
import java.util.Random;
import java.util.Scanner;
public class Acara11n12_Tugas2 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int panjangDeret;
        System.out.print("Masukkan jumlah deret: ");
        panjangDeret=scan.nextInt();
        int[] deretAngka=new int[panjangDeret];
        for(int i=0;i<deretAngka.length;i++){
            deretAngka[i]=rand.nextInt(100);
        }
        for(int angka:deretAngka){
            System.out.print(angka+" ");
        }
        System.out.println("");
    }
}