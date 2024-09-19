#include <stdio.h>

int main()
{
    int rows, i, j, space;

    printf("Enter the number of rows: ");
    scanf("%d", &rows);

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
