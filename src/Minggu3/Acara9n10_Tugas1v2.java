package Minggu3;
import java.util.Scanner;
public class Acara9n10_Tugas1v2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan dimasukkan= ");
        int jumlahAngka=scan.nextInt();
        int[] angka=new int[jumlahAngka];
        for(int i=0;i<angka.length;i++){
            angka[i]=scan.nextInt();
        }
        for(int i:angka){
            System.out.print(angka[i-1]+" ");
        }
    }
}