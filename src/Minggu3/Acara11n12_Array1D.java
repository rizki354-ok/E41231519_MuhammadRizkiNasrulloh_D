package Minggu3;
public class Acara11n12_Array1D {
    public static void main(String[] args) {
        int[] angka={5, 10, 17, 20, 1};
        String[] teks={"Saya", "sedang", "belajar", "OOP", "Java"};
        for(int i=0;i<angka.length;i++){
            System.out.println(angka[i]);
        }
        for(int i=0;i<teks.length;i++){
            System.out.print(teks[i]);
            System.out.print(" ");
        }
    }
}