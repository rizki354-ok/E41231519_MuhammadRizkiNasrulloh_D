package Minggu4;

import java.util.Arrays;
public class BinarySearch {
    public static int binary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;//mencari target kemudian mengembalikan indeks dari nilai target tersebut jika ditemukan dan
                                  //-1 jika tidak ditemukan
        
        while (low <= high) {
            int center = (low + high) / 2; //terus berjalan selama nilai low tidak melebihi nilai high.
            // Ini berarti bahwa selama masih ada bagian dari array yang belum diperiksa, algoritma akan terus mencari.
            
            if (arr[center] == target) {
                return center; // elemen ditemukan
            } else if (arr[center] < target) {
                low = center + 1; // nilai low
            } else {
                high = center - 1; // nilai high
            }
        }
        return -1; // elemen tidak ditemukan
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,4,9,12,17,14,16,13};
        Arrays.sort(arr);
        int target = 17; // target
        
        int result = binary(arr, target);
        
        if (result != -1) {
            System.out.println("Elemen " + target + " ditemukan pada indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }
    }
    
}
//public class BinarySearch {
//    public static void main(String[] args) {
//        int[] exampleVariableOne={2, 9, 6, 7, 4, 5, 3, 0, 1};
//        int target=6;
//        binarySearch(exampleVariableOne, target);
//        System.out.println(5/2);
//        System.out.println(6/2);
//        System.out.println(save);
//    }
//    public static int save;
//    public static void binarySearch(int[] param1, int param2){
//        Arrays.sort(param1);
//        for(int angka:param1){
//            System.out.println(angka+" ");
//        }
//        if(param1[(param1.length)/2]<=param2){
//            if(param1[(param1.length)/2]==param2){
//                save=(param1.length)/2;
//                System.out.println("ekse");
//            }else{
//                for(int i=0;i<((param1.length)/2)+1;i++){
//                    System.out.println(param1[i]);
//                    if(param1[i]==param2){
//                        save=i;
//                        System.out.println("ok");
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}