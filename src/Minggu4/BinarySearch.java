package Minggu4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] exampleVariableOne={2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target=6;
        binarySearch(exampleVariableOne, target);
        System.out.println(5/2);
        System.out.println(6/2);
        System.out.println(save);
    }
    public static int save;
    public static void binarySearch(int[] param1, int param2){
        Arrays.sort(param1);
        for(int angka:param1){
            System.out.println(angka+" ");
        }
        if(param1[(param1.length)/2]<=param2){
            if(param1[(param1.length)/2]==param2){
                save=(param1.length)/2;
                System.out.println("ekse");
            }else{
                for(int i=0;i<((param1.length)/2)+1;i++){
                    System.out.println(param1[i]);
                    if(param1[i]==param2){
                        save=i;
                        System.out.println("ok");
                        break;
                    }
                }
            }
        }
    }
}
