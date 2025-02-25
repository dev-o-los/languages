#include <stdio.h>
#include <stdlib.h>
#include "node.h"

void delNodeInBegin(struct node *head)
{
    struct node *temp = head;
    head = head->next;
    free(temp);
    temp = NULL;
    printlinkedlist(head);
}

void delNodeInEnd(struct node *head)
{

    if (head == NULL)
    {
        printf("Underflow and stop");
        return;
    }
    else
    {
        struct node *cpt = head;
        while (cpt->next->next != NULL)
        {
            cpt = cpt->next;
        }
        struct node *temp = cpt->next;
        free(temp);
        cpt->next = NULL;
    }

    printlinkedlist(head);
}

void delNodeAtPos(struct node *head, int after)
{

    if (head == NULL)
    {
        printf("Underflow and stop");
        return;
    }
    else
    {
        struct node *cpt = head;
        while (cpt->next->data != after)
        {
            cpt = cpt->next;
        }
        struct node *temp = cpt->next;
        cpt->next = cpt->next->next;
        free(temp);
    }

    printlinkedlist(head);
}

void reverseList(struct node *head)
{
    struct node *prev = NULL;
    struct node *current = head;
    struct node *next = NULL;
    while (current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    head = prev;
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

    delNodeAtPos(head, 90);
    reverseList(head);

    return 0;
}
