#include <stdio.h>
#define MAX 5
int func(int *p)
{
    // printf("%d\n", *p);
    // printf("%d\n", *(p + 1));
    // printf("%d\n", *(p + 2));
    // printf("%d\n", *(p + 3));
}
int main()
{
    int arr[MAX] = {1, 2, 3, 4, 5};
    int *ptr = arr;
    printf("%d\n", *ptr);
    func(ptr);
    // int *p = 1;
    // int *q = 2;
    // int *r = 3;
    // int *arr[3] = {&p, &q, &r};
    // printf("%d\n", *arr[1]);
}