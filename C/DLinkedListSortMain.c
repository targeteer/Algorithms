#include <stdio.h>
#include "DLinkedList.h"

int WhoIsPrecede(LData d1, LData d2)
{
    if(d1 < d2)
        return 0;
    else
        return 1;
}

int main(void)
{
    List list;
    int data;
    ListInit(&list);

    SetSortRule(&list, WhoIsPrecede);

    LInsert(&list, 22);
    LInsert(&list, 32);
    LInsert(&list, 42);
    LInsert(&list, 52);
    LInsert(&list, 12);

    printf("현재 데이터의 수: %d \n", LCount(&list));
}