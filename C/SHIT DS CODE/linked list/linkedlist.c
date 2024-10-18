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
        printf("Linked list is empty");
    }
    struct node *ptr = NULL, *node = NULL;
    ptr = head;

    node = malloc(sizeof(struct node));
    node->data = data;
    node->next = NULL;

    while (ptr->next != NULL)
    {
        ptr = ptr->next;
    }
    ptr->next = node;
}

int main(int argc, char const *argv[])
{
    printf("=====================Program Start===========================\n");
    struct node *head = NULL;
    head = (struct node *)malloc(sizeof(struct node));

    head->data = 45;
    head->next = NULL;

    struct node *current = malloc(sizeof(struct node));

    current->data = 50;
    current->next = NULL;

    head->next = current;

    current = malloc(sizeof(struct node));
    current->data = 55;
    current->next = NULL;

    head->next->next = current;
    printlinkedlist(head);

    printf("=====================After adding new node===========================\n");

    addNewNodeInEnd(head, 90);

    printlinkedlist(head);

    printf("=====================Program End===========================\n");

    return 0;
}
