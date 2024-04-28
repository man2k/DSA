import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class OptimiseMin {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            // arr[i] = new Random().nextInt(1000);
            arr[i] = Integer.parseInt(args[2+i]);
        }
        printArr(arr);
        // int min = Arrays.stream(arr).min().getAsInt();
        // int max = Arrays.stream(arr).max().getAsInt();
        // System.out.println(min);
        // System.out.println(max);
        Arrays.sort(arr);
        printArr(arr);
        System.out.println("Min diff = "+ findMinDiff(arr,n,k));
    }    
    
    public static int findMinDiff(int arr[], int n, int k){
        int mind = Integer.MAX_VALUE;
        for(int i = 0; i<n-k+1;i++){
            mind = Math.min(mind, arr[i+k-1]-arr[i]);
        }
        return mind;
        
    }
    
    public static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+", ");
        }
        System.out.println();
    }
}
