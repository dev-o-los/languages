#include <stdio.h>

int main(int argc, char const *argv[])
{
    int n, a[20];
    printf("Enter the length of array");
    scanf("%d", &n);
    printf("Enter the elements\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Traversing of array\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    return 0;
}
