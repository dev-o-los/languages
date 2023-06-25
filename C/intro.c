#include <stdio.h>
#include <ctype.h>

int main(int argc, char const *argv[])
{
    char str[50];
    printf("Enter you full name\n");
    gets(str);
    printf(str);
    putchar('\n');
    for (int i = 0; str[i]; i++)
    {
        str[i] = tolower(str[i]);
    }
    printf(str);
    return 0;
}
