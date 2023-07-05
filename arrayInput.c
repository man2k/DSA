#include <stdio.h>
#define LEN 10
int main()
{
    printf("Enter the contents of the array\n");
    printf("-------------------------------------------\n");
    int arr[LEN];
    for (int i = 0; i < LEN; i++)
    {
        scanf("%d", &arr[i]);

        // fgets(arr, sizeof(arr), stdin);
    }
    printf("Your array is :\n");
    for (int i = 0; i < LEN; i++)
    {
        printf("%d ", arr[i]);
    }
}