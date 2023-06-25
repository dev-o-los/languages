#include <stdio.h>

void armstrong()
{
    int copy, arm = 0, rem, n = 0;
    printf("Enter your number:");
    scanf("%d", &n);
    copy = n;
    while (copy > 0)
    {
        rem = (copy % 10);
        arm += rem * rem * rem;
        copy = copy / 10;
    }

    if (arm == n)
    {
        printf("%d is a armstrong number", n);
    }
    else
    {
        printf("%d is not a armstrong number", n);
    }
}

int main()
{
    armstrong();
    return 0;
}