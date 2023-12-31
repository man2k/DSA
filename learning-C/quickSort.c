// C code to implement quicksort

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define printExecTime(t) printf("\nElapsed: %f seconds\n", (double)(clock() - (t)) / CLOCKS_PER_SEC)

// Function to swap two elements
void swap(int *a, int *b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

// Partition the array using the last element as the pivot
int partition(int arr[], int low, int high)
{
    // Choosing the pivot
    int pivot = arr[high];

    // Index of smaller element and indicates
    // the right position of pivot found so far
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++)
    {

        // If current element is smaller than the pivot
        if (arr[j] < pivot)
        {

            // Increment index of smaller element
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

// The main function that implements QuickSort
// arr[] --> Array to be sorted,
// low --> Starting index,
// high --> Ending index
void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {

        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);

        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

// Driver code
int main()
{
    // int arr[] = { 10, 7, 8, 9, 1, 5 };
    // int N = sizeof(arr) / sizeof(arr[0]);
    srand(time(NULL));
    int N = 100;
    int arr[N];
    for (int i = 0; i < N; i++)
    {
        arr[i] = rand() % 10000;
    }

    // Function call
    // clock_t begin = clock();
    clock_t t = clock();
    printExecTime(t);
    quickSort(arr, 0, N - 1);
    printExecTime(t);
    // clock_t end = clock();
    // double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    printf("Sorted array: \n");
    for (int i = 0; i < N; i++)
        printf("%d ", arr[i]);
    // printf("\nTime required: %f\n", time_spent);
    return 0;
}
