#include <stdio.h>

int main(int argc, char const *argv[])
{
    char str[900] = "asasas10m2m3434m";
    int i = 0;
    int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    while (str[i] != '\0')
    {
        switch (str[i])
        {
        case '0':
            arr[0]++;
            break;
        case '1':
            arr[1]++;
            break;
        case '2':
            arr[2]++;
            break;
        case '3':
            arr[3]++;
            break;
        case '4':
            arr[4]++;
            break;
        case '5':
            arr[5]++;
            break;
        case '6':
            arr[6]++;
            break;
        case '7':
            arr[7]++;
            break;
        case '8':
            arr[8]++;
            break;
        case '9':
            arr[9]++;
            break;

        default:
            break;
        }
        i++;
    }

    for (int i = 0; i < 10; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}
