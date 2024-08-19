#include <stdio.h>

int main()
{
    int rows, i, j, space;
    rows = 5;

    for (i = 1; i <= rows - 1; ++i)
    {
        // Print spaces and stars in a single loop
        for (j = 1; j <= rows; ++j)
        {
            if (j <= rows - i)
                printf("  ");
            else
                printf("* ");
        }
        printf("\n");
    }
    for (i = 1; i <= rows; ++i)
    {
        // Print spaces and stars in a single loop
        for (j = 1; j <= rows; ++j)
        {
            if (j < i)
                printf("  ");
            else
                printf("* ");
        }
        printf("\n");
    }

    return 0;
}
