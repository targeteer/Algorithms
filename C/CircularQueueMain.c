#include <stdio.h>
#include "CircularQueue.h"
#include "CircularQueue.c"

int main(void)
{
    Queue pq;
    QueueInit(&pq);

    Enqueue(&pq, 23);
    Enqueue(&pq, 24);
    Enqueue(&pq, 25);
    Enqueue(&pq, 26);
    Dequeue(&pq);

    while(!QIsEmpty(&pq))
        printf("%d ", Dequeue(&pq));
    
    return 0;
}