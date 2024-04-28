import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        
        Random rand = new Random();
        int arr[] = new int[20];

        for(int i = 0; i<20;i++){
            arr[i] = rand.nextInt(100, 10000);
            // arr[i] = (int)(Math.random()*(901))+100;
        }
        for(int i:arr){
            System.out.print(i+", ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+", ");
        }
    }
    private static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static void quickSort(int[] arr, int lindex, int hindex){
        if(lindex>=hindex){
            return;
        }
        int pivotindex = new Random().nextInt(hindex-lindex)+lindex; 
        int pivot = arr[pivotindex];
        swap(arr, pivotindex, hindex);
        int lp = lindex; 
        int rp = hindex;
        while(lp<rp){
            while(arr[lp] <= pivot && lp<rp){
                lp++;
            }
            while(arr[rp]>= pivot && lp<rp){
                rp--;
            }
            swap(arr, lp, rp);
            
        }
        swap(arr, lp, hindex);
        quickSort(arr, lindex, lp-1);
        quickSort(arr, lp+1, hindex);
    }
}
