#include <stdio.h>
#include <string.h>
void StringChallenge(char *str)
{

    int len = strlen(str);
    for (int i = 0; i < len; i++)
    {
        printf(" str: %d \n", str[i]);
        if (str[i] < 65 || str[i] > 122)
        {
            printf("hit");
            str[i] = '_';
        }
    }
    int cou = 0;

    // code goes here
    printf("%s", str);
}

int main(void)
{

    // keep this function call here
    //   StringChallenge(coderbyteInternalStdinFunction(stdin));
    //   return 0;
    char str[] = "cats AND*Dogs-are Awesome";
    StringChallenge(str);
}