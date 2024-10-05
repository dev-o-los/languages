#include <stdio.h>
#include <stdlib.h>
#include "node.h"

int main()
{
    printf("=====================Program Start===========================\n");
    struct node *head = NULL;
    head = (struct node *)malloc(sizeof(struct node));

    head->data = 45;
    head->next = NULL;

    addNewNodeInEnd(head, 90);
    addNewNodeInEnd(head, 34);
    addNewNodeInEnd(head, 67);

    printlinkedlist(head);

    return 0;
}
