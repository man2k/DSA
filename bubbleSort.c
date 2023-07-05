#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

// bubbleSort(int *arr, int n);
// printArray(int *arr, int n);
// swap(int *x, int *y);
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

int bubbleSort(int *arr, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
                swapped = true;
            }
        }
        if (swapped == false)
        {
            break;
        }
    }
}

int main()
{
    srand(time(NULL));
    // printf("time: %d\n", time(NULL));
    int n = 100;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = rand() % 10000;
    }
    bubbleSort(arr, n);
    printArray(arr, n);
}