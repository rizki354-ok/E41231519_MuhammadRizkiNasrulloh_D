package Minggu3;
public class Acara9n10_Tugas2 {
    public static void main(String[] args) {
        System.out.println("""
         Do__While
Bilangan kelipatan 2 (1-100)
============================""");
        int i=1;
        do{
            System.out.print("  "+i);
            i*=2;
        }while(i<100);
        System.out.println("");
//        for(int j=1;j<100;j*=2){
//            System.out.print("  "+j);
//        }
//        System.out.println("");
    }
}