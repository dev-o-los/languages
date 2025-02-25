#include <stdio.h>
#define SIZE 5

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
    return (q->rear + 1) % SIZE == q->front;
}

void enQueue(struct Queue *q, int x)
{
    if (isFull(q))
    {
        printf("Queue is full\n");
        return;
    }
    if (isEmpty(q))
    {
        q->front = 0;
    }
    q->rear = (q->rear + 1) % SIZE;
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
        q->front = (q->front + 1) % SIZE;
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
    int i = q->front;
    while (i != q->rear)
    {
        printf("%d ", q->queue[i]);
        i = (i + 1) % SIZE;
    }
    printf("%d ", q->queue[q->rear]);
}

int main(int argc, char const *argv[])
{
    struct Queue q;
    createQueue(&q);
    enQueue(&q, 1);
    enQueue(&q, 2);
    enQueue(&q, 3);
    enQueue(&q, 4);
    enQueue(&q, 5);
    deQueue(&q);
    enQueue(&q, 6);
    display(&q);
    return 0;
}
