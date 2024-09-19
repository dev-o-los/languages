#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    char x[20], y[20];
    printf("Enter x\n");
    scanf("%s", &x);
    printf("Enter y\n");
    scanf("%s", &y);
    strcat(x, y);
    printf("%d", strcmp(x, y));
    return 0;
}
