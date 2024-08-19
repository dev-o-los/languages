#include <stdio.h>

int main()
{
    int i, j, rows;

    // Number of rows for the pyramid
    // printf("Enter the number of rows: ");
    // scanf("%d", &rows);
    rows = 5;

    for (i = 1; i <= rows; i++)
    {
        // Print spaces for alignment
        for (j = 1; j <= rows - i; j++)
        {
            printf(" ");
        }
        // Print stars
        for (j = 1; j <= 2 * i - 1; j++)
        {
            printf("*");
        }
        // Move to the next line
        printf("\n");
    }

    return 0;
}
