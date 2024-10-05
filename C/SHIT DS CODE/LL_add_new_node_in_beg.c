#include <stdio.h>
#include <stdlib.h>
#include "node.h"

void addNodeInBegin(struct node *head, int data)
{

    if (head == NULL)
    {
        head->data = data;
        head->next = NULL;
    }

    struct node *ptr = malloc(sizeof(struct node));
    ptr->data = data;
    ptr->next = head;
    head = ptr;
    printlinkedlist(head);
}

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

    addNodeInBegin(head, 5);

    return 0;
}
