#include <stdio.h>

int main()
{
    int sum = 0;
    int n;
    printf("Enter the length of the array: ");
    scanf("%d", &n);
    printf("Enter the numbers to be added\n");
    printf("--------------------------------\n");
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }
    printf("--------------------------------\nThe sum is: %d\n", sum);
}