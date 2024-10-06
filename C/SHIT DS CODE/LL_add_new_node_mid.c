#include <stdio.h>
#include <stdlib.h>
#include "node.h"

void addNewNodeATPos(struct node *head, int data, int after)
{
    if (head == NULL)
    {
        printf("Empty linked list");
        return;
    }
    struct node *cpt = malloc(sizeof(struct node));
    cpt = head;
    while (cpt->data != after)
    {
        cpt = cpt->next;
    }
    struct node *ptr = malloc(sizeof(struct node));
    ptr->data = data;
    ptr->next = cpt->next;
    cpt->next = ptr;
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

    addNewNodeATPos(head, 999, 34);
    printlinkedlist(head);

    return 0;
}
