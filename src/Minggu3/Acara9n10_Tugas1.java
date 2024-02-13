package Minggu3;
import java.util.Scanner;
public class Acara9n10_Tugas1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int batasAwal, batasAkhir;
        System.out.print("Masukkan batas awal= ");
        batasAwal=scan.nextInt();
        System.out.print("Masukkan batas akhir= ");
        batasAkhir=scan.nextInt();
        for(;batasAwal<batasAkhir+1;batasAwal++){
            if(batasAwal%2==0){
                System.out.println(batasAwal);
            }
        }
    }
}