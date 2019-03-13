#include <stdio.h>
#include <stdlib.h>

typedef struct _node
{
    int data;
    struct _node * next;
} Node;

int main(void)
{
    Node * head = NULL;
    Node * tail = NULL;
    Node * cur = NULL;

    Node * newNode = NULL;
    int readData;

    while(1)
    {
        printf("자연수 입력: ");
        scanf("%d", &readData);
        if (readData < 1)
            break;

        //노드의 추가과정
        newNode = (Node*)malloc(sizeof(Node));
        newNode -> data = readData;
        newNode -> next = NULL;

        if(head==NULL)
            head = newNode;
        else
            tail->next = newNode;
        
        tail = newNode;
    }
    printf("\n");

    //입력받은 데이터 출력 과정
    printf("입력 받은 데이터 전체 출력! \n");
    if(head == NULL)
        printf("데이터가 존재하지 않습니다! \n");
    else
    {
        cur = head;
        printf("%d", cur->data);

        if(cur->next != NULL)
        {
            cur = cur ->next;
            printf("%d", cur->data);
        }
    }
    printf("\n\n");

    //메모리의 해제 과정
    if(head==NULL)
    {
        return 0; //해제할 메모리가 존재하지 않음
    }
    else
    {
        Node * delNode= head;
        Node * delNextNode = head->next;

        printf("%d를 삭제합니다.", head->data);
        free(delNode);

        while(delNextNode != NULL) 
        {
            delNode = delNextNode;
            delNextNode = delNextNode->next;
        
           printf("%d를 삭제합니다.", head->data);
           free(delNode);
        }
    }
    return 0;
}