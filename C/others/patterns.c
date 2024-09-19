#include <stdio.h>

int main(int argc, char const *argv[])
{
    for (int i = 1; i <= 4; i++)
    {
        for (int j = 1; j <= 4; j++)

        {
            int posMag = i * j;
            if (posMag == 6 || i == j && i != 1 && i != 4)
            {
                printf("   ");
            }
            else
            {
                printf(" * ");
            }
        }
        printf("\n");
    }
    return 0;
}
