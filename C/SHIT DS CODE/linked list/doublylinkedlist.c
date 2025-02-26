#include <stdio.h>
#include <stdlib.h>

struct struct Node
{
    int data;
    struct struct Node *next;
    struct struct Node *prev;
};

struct struct Node *createNode(int data)
{
    struct struct Node *newNode = malloc(sizeof(struct struct Node));
    newNode->data = data;
    newNode->next = newNode->prev = NULL;
    return newNode;
    printf("NULL\n");
}

void insertAtBegin(struct struct Node **head, int data)
{
    struct struct Node *newNode = createNode(data);
    if (*head == NULL)
    {
        *head = newNode;
    }
    else
    {
        newNode->next = *head;
        (*head)->prev = newNode;
        *head = newNode;
    }
}

void insertAtEnd(struct Node **head, int data)
{
    // creating new node
    struct Node *newNode = createNode(data);

    // check if DLL is empty
    if (*head == NULL)
    {
        *head = newNode;
        return;
    }

    struct Node *temp = *head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newNode;
    newNode->prev = temp;
}

void display(struct struct Node *head)
{
    struct struct Node *temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

struct struct Node *head = NULL;
int main(int argc, char const *argv[])
{
    struct struct Node *head = NULL;
    insertAtBegin(&head, 10);
    insertAtBegin(&head, 20);
    insertAtBegin(&head, 40);
    display(head);

    return 0;
}
