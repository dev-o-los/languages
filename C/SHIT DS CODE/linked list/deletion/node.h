#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void printlinkedlist(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked list is empty");
    }
    struct node *ptr = NULL;
    ptr = head;
    while (ptr != NULL)
    {
        printf("%d -> ", ptr->data);
        ptr = ptr->next;
    }
    printf("NULL\n");
}

void addNewNodeInEnd(struct node *head, int data)
{
    if (head == NULL)
    {
        printf("Underflow (for del) or Overflow (for add) and stop");
    }
    struct node *ptr = NULL, *node = NULL;
    ptr = head;

    node = (struct node *)malloc(sizeof(struct node));
    node->data = data;
    node->next = NULL;

    while (ptr->next != NULL)
    {
        ptr = ptr->next;
    }
    ptr->next = node;
}