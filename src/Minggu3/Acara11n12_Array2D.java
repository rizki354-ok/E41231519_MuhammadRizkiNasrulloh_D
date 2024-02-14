package Minggu3;
public class Acara11n12_Array2D {
    public static void main(String[] args) {
        int[][] angka={{5,4,2,1,5},{9,6,5,7,8},{5,2,1,5,10}};
        for (int baris=0;baris<3;baris++){
            for (int kolom=0;kolom<5;kolom++){
                System.out.print(angka[baris][kolom]+"   ");
            }
            System.out.println("");
        }
//        metode for each
//        for(int[] baris:angka){
//            for(int element:baris){
//                System.out.print(element+"   ");
//            }
//            System.out.println("");
//        }
//        baris dan kolom bisa otomotis
//        for (int baris=0;baris<angka.length;baris++){
//            for (int kolom=0;kolom<angka[baris].length;kolom++){
//                System.out.print(angka[baris][kolom]+"   ");
//            }
//            System.out.println("");
//        }
    }
}