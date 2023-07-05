#include <stdio.h>
#define MAX 100000

void printPairs(int A[], int size, int target)
{
    int hm[MAX] = {0};
    int temp, i;

    for (i = 0; i < size; i++)
    {
        temp = target - A[i];
        // printf("A[i] = %d ", A[i]);
        printf("temp = %d\n", temp);
        if (hm[temp] == 1)
        {
            printf("A[%d] %d ", i, A[i]);
            printf("Yes\n");
            return;
        }
        hm[A[i]] = 1;
    }
    printf("No\n");
    return;
}

int main()
{
    int A[] = {-6, -1, -2, -3, -1};
    int target = -7;
    int size = sizeof(A) / sizeof(A[0]);
    printPairs(A, size, target);

    getchar();
    return 0;
}