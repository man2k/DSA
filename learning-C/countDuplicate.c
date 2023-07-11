#include <stdio.h>

int countDuplicate(int *arr, int len)
{
    int c = 0;
    for (int i = 0; i < len - 1; i++)
    {
        for (int j = i + 1; j < len; j++)
        {
            if (*(arr + i) == *(arr + j))
            {
                c++;
                break;
            }
        }
    }
    return c;
}

int main()
{
    int arr[] = {5, 8, 7, 9, 7, 5, 6, 8, 2, 11, 5, 2, 6, 8, 8};
    int len = sizeof(arr) / sizeof(arr[0]);
    int count = countDuplicate(arr, len);
    printf("The count of Duplicates are: %d\n", count);
}
