import java.util.Random;

import javax.print.event.PrintEvent;
public class QuickSortpr {
    public static void main(String args[]){
        int n = 50;
        Random rand = new Random(1);
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = new Random().nextInt(100);
            // arr[i] = rand.nextInt(1000);            
        }
        // printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }   

    public static void printArr(int arr[]){
        for(int i: arr){
            System.out.print(i+ ", ");
        }
        System.out.println();
        System.out.println();
    }
    public static void printArr(int arr[], int lindex, int hindex){
        for(int i = lindex; i<=hindex; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }
    
    public static void quickSort(int arr[], int lindex, int hindex){
        if(lindex>=hindex){
            return;
        }
        int pivotIndex = new Random().nextInt(hindex-lindex)+lindex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, hindex);
        int lp = lindex;
        int hp = hindex;
        while(lp<hp){
            while(arr[lp]<=pivot && lp<hp){
                lp++;
            }
            while(arr[hp]>=pivot && lp<hp){
                hp--;
            }
            // printArr(arr, lindex, hindex);
            // System.out.print(lp+" "+hp);
            // System.out.print(pivot+" ");

            swap(arr, lp, hp);
        }
        swap(arr, lp, hindex);
        quickSort(arr, lindex, lp-1);
        quickSort(arr, lp+1, hindex);

    }


    private static void swap(int arr[], int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
