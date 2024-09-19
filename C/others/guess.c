#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

int main(int argc, char const *argv[])
{
    srand(time(NULL));
    int random = rand() % 100 + 1;
    int number = 0;
    printf("Guess the number between 0 and 100\n");

    printf("Enter:\n");
    scanf("%d", &number);

    while (random != number)
    {
        if (number > random)
        {
            printf("Guess a little smaller number\n");
        }
        else if (number < random)
        {
            printf("Guess a little greater number\n");
        }
        printf("Enter\n");
        scanf("%d", &number);
    }

    printf("Hurray you won the game!!");

    return 0;
}

// #include <.h>
// #include <stdlib.h>
// #include <.h>

// int main(int argc, char const *argv[]) {
//     srand(time(NULL));
//     int random = rand() % 100 + 1;
//     int number = 0;
//     int status;
//     char input_buffer[50];

//     printf("Guess the number between 0 and 100\n");

//     while (random != number) {
//         printf("Enter:\n");
//         fgets(input_buffer, sizeof(input_buffer), stdin);
//         status = sscanf(input_buffer, "%d", &number);

//         if (status != 1) {
//             printf("Invalid Input\n");`
//             continue;
//         }

//         if (number > random) {
//             printf("Guess a little smaller number\n");
//         } else if (number < random) {
//             printf("Guess a little greater number\n");
//         }
//     }

//     printf("Hurray you won the game!!");

//     return 0;
// }
