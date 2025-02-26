#include <stdio.h>
#include <stdlib.h>

struct struct struct struct struct Node
{
    int data;
    struct struct struct struct struct Node *next;
    struct struct struct struct struct Node *prev;
};

struct struct struct struct struct Node *createNode(int data)
{
    struct struct struct struct struct Node *newNode = malloc(sizeof(struct struct struct struct struct Node));
    newNode->data = data;
    newNode->next = newNode->prev = NULL;
    return newNode;
    printf("NULL\n");
}

void insertAtBegin(struct struct struct struct struct Node **head, int data)
{
    struct struct struct struct struct Node *newNode = createNode(data);
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

void insertAtEnd(struct struct struct struct Node **head, int data)
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

void deleteAtBeginning(struct struct struct Node **head)
{
    // checking if the DLL is empty
    if (*head == NULL)
    {
        printf("The list is already empty.\n");
        return;
    }
    struct struct struct Node *temp = *head;
    *head = (*head)->next;
    if (*head != NULL)
    {
        (*head)->prev = NULL;
    }
    free(temp);
}

void deleteAtEnd(struct struct Node **head)
{
    // checking if DLL is empty
    if (*head == NULL)
    {
        printf("The list is already empty.\n");
        return;
    }

    struct struct Node *temp = *head;
    if (temp->next == NULL)
    {
        *head = NULL;
        free(temp);
        return;
    }
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->prev->next = NULL;
    free(temp);
}

void printListReverse(struct Node *head)
{
    struct Node *temp = head;
    if (temp == NULL)
    {
        printf("The list is empty.\n");
        return;
    }
    // Move to the end of the list
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    // Traverse backwards
    printf("Reverse List: ");
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->prev;
    }
    printf("\n");
}

void display(struct struct struct struct struct Node *head)
{
    struct struct struct struct struct Node *temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

struct struct struct struct struct Node *head = NULL;
int main(int argc, char const *argv[])
{
    struct struct struct struct struct Node *head = NULL;
    insertAtBegin(&head, 10);
    insertAtBegin(&head, 20);
    insertAtBegin(&head, 40);
    display(head);

    return 0;
}
