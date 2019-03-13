#include <stdio.h>
#include <stdlib.h>
#include "ListBaseQueue.h"

void QueueInit(Queue * pq)
{
    pq->front = NULL;
    pq->rear = NULL;
}

int QIsEmpty(Queue * pq)
{
    if(pq->front == NULL)
        return TRUE;
    else
        return FALSE;
}

void Enqueue(Queue * pq, Data data)
{
    Node * newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;

    if(QIsEmpty(pq))
    {
        pq->front = newNode;
        pq->rear = newNode;
    }
    else
    {
        pq->rear->next = newNode;
        pq->rear = newNode;
    }
}

int Dequeue(Queue * pq)
{
    Node * delNode;
    Data retData;

    if(QIsEmpty(pq))
    {
        printf("QUEUE MEMORY ERROR!");
        exit(-1);
    }
    
    delNode = pq->front;
    retData = delNode->data;
    pq->front = pq->front->next;

    free(delNode);

    return retData;
}