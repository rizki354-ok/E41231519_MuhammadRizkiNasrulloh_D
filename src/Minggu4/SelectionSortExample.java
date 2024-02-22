package Minggu4;
public class SelectionSortExample {
    static void selectionSort(int[] arr){
        int save,temp;
        for(int indexDipilih=0;indexDipilih<arr.length;indexDipilih++){
            save=indexDipilih;
            for(int j=indexDipilih+1;j<arr.length;j++){
                save=(arr[save]<arr[j])?save:j;
            }
            temp=arr[save];
            arr[save]=arr[indexDipilih];
            arr[indexDipilih]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Selection Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Array After Selection Sort");
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}