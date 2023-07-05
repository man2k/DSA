#include <stdio.h>
#include <stdlib.h>

// Selection sort
int printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

int selectionSort(int *arr, int n)
{
    int i, j, min;
    for (int i = 0; i < n; i++)
    {
        min = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[min] > arr[j])
            {
                min = j;
            }
        }
        if (min != i)
        {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    return 0;
}

int main()
{
    // int arr[] = {64, 25, 12, 22, 11};
    int n = 5000;
    int arr[n];
    srand(0);

    for (int i = 0; i < n; i++)
    {
        arr[i] = rand() % 1000;
    }
    // int n = sizeof(arr) / sizeof(arr[0]);
    selectionSort(arr, n);
    printf("Sorted array: \n");
    printArray(arr, n);
    return 0;
}