#include <stdio.h>
#define SIZE 100

struct Queue
{
    int queue[SIZE];
    int front;
    int rear;
} *q;

void createQueue(struct Queue *q)
{
    q->front = -1;
    q->rear = -1;
}

int isEmpty(struct Queue *q)
{
    return q->front == -1;
}

int isFull(struct Queue *q)
{
    return q->rear == SIZE - 1;
}

void enQueue(struct Queue *q, int x)
{
    if (isFull(q))
    {
        printf("Queue is full");
    }
    if (isEmpty(q))
    {
        q->front = 0;
    }
    q->rear++;
    q->queue[q->rear] = x;
    printf("Enqueued %d in queue\n", x);
}

int deQueue(struct Queue *q)
{

    if (isEmpty(q))
    {
        printf("Queue is empty");
        return -1;
    }
    int data = q->queue[q->front];

    if (q->front == q->rear)
    {
        q->rear = -1;
        q->front = -1;
    }
    else
    {
        q->front++;
    }

    printf("Deleted %d in queue\n", data);
    return data;
}

void display(struct Queue *q)
{
    if (isEmpty(q))
    {
        printf("Empty");
        return;
    }
    for (int i = q->front; i <= q->rear; i++)
    {
        printf("%d ", q->queue[i]);
    }
}

int main(int argc, char const *argv[])
{
    struct Queue q;
    createQueue(&q);
    enQueue(&q, 1);
    enQueue(&q, 2);
    enQueue(&q, 3);
    deQueue(&q);
    display(&q);
    return 0;
}
