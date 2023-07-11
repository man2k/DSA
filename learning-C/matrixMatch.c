#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int match(int n, int m1[][n], int m2[][n])
{
    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (m1[i][j] != m2[i][j])
                flag += 1;
        }
    }
    return flag;
}

int main()
{
    int n = 10;
    srand(time(NULL));
    int arr[n][n];
    int arr2[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            int r = rand() % 10;
            // arr[i][j] = rand() % 10;
            // arr2[i][j] = rand() % 10;
            arr[i][j] = r;
            arr2[i][j] = r;
        }
    }
    // if (match(n, arr, arr2) == 0)
    // {
    //     printf("Matched\n");
    // }
    // else
    // {
    //     printf("Doesn't Match\n");
    // }
    printf("Match: %d", match(n, arr, arr2));
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < n; j++)
    //     {
    //         printf("%d  ", arr[i][j]);
    //     }
    //     printf("\n");
    // }
}