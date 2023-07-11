#include <stdio.h>

int removeElement(int *nums, int numsSize, int val)
{
    printf("%d\n\n", &nums);
    int last = numsSize - 1;
    int re = 0;
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] == val)
        {
            *nums[i] = &nums[last];
            nums[last] = -1;
        }
        else
        {
            re++;
        }
    }
    for (int i = 0; i < numsSize; i++)
    {
        printf("%d\n", nums[i]);
    }
    return 0;
}
// int main()
// {
//     int arr = [ 3, 2, 2, 3 ];
//     removeElement()
// }