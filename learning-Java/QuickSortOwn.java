import java.util.Random;
public class QuickSortOwn {
    public static void main(String args[]){
        Random rand = new Random();
        int N = 100;
        int arr[] = new int[N];
        for(int i = 0 ; i< N ; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        printArray(arr);
        System.out.println("\nAfter: ");
        quickSort(arr);
        printArray(arr);

    }

    private static void quickSort(int arr[]){
        quickSort(arr, 0 , (arr.length-1));
    }
    private static void quickSort(int arr[], int lowIndex, int highIndex){
        if(lowIndex >= highIndex)
            return;
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        // return leftPointer;
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }

    private static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }

    public static void printArray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
