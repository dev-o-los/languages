#include <stdio.h>

int array_length(int array[])
{
    int count = 0;
    for (int i = 0; array[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}

int main(int argc, char const *argv[])
{

    int array[10] = {2, 3, 6, 7, 8}; // 10 = max
    int ub = array_length(array) - 1, n;
    if (ub == 9)
    {
        printf("Array is full");
    }
    else
    {
        printf("Enter the element to enter\n");
        scanf("%d", &n);
        ub = ub + 1;
        array[ub] = n;
        for (int i = 0; i <= ub; i++)
        {
            printf("%d ", array[i]);
        }
    }

    return 0;
}
