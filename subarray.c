#include <stdio.h>

int subarrSum(int arr[], int n, int s)
{
    for (int i = 0; i < n - 1; i++)
    {
        int k = arr[i];
        for (int j = i + 1; j < n - 1; j++)
        {
            k += arr[j];
            if (k == s)
            {
                printf("i = %d ; j = %d", i + 1, j + 1);
            }
        }
    }
    return 0;
}

int main(void)
{
    int arr[] = {1, 2, 3, 7, 5};
    int arlen = sizeof(arr) / sizeof(arr[0]);
    int t = 12;

    subarrSum(arr, arlen, t);
    return 0;
}
