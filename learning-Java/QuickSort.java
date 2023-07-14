import java.util.Random;

public class QuickSort {
    public static void main(String args[]) {
        // Random rand = new Random();
        // int numbers[] = new int[100000];
        // for (int i = 0; i < numbers.length; i++) {
        //     numbers[i] = rand.nextInt(50);
        // }
        int numbers[] = {5,9,4,3,7,2};
        System.out.println("Before: ");
         printArray(numbers);
        // quickSort(numbers, 0, numbers.length - 1);
        quickSort(numbers);
        System.out.println("\nAfter :");
        printArray(numbers);
    }

    private static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int arr[], int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static int partition(int arr[], int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
