#include <stdio.h>

int main(int argc, char const *argv[])
{
    int list[10], n;

    printf("Enter n\n");
    scanf("%d", &n);

    printf("Enter elements\n");

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &list[i]);
    }

    for (int i = 1; i < n; i++)
    {
        int temp = list[i];
        int j = i - 1;

        while (j >= 0 && list[j] > temp)
        {
            list[j + 1] = list[j];
            j--;
        }
        list[j + 1] = temp;
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d ", list[i]);
    }

    return 0;
}
