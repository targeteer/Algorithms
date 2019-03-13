#include <stdio.h>
#include <stdlib.h>
#include "ArrayBaseStack.h"

void StackInit(Stack * pstack)
{
    pstack -> topIndex = -1;
}

int SIsEmpty(Stack * pstack)
{
    if(pstack->topIndex == -1)
        return TRUE;
    else
        return FALSE;
}

void SPush(Stack * pstack, Data data)
{
    pstack -> topIndex += 1;
    pstack -> stackArr[pstack -> topIndex] = data;
}

Data SPop(Stack * pstack)
{
    int rIdx;

    if(SIsEmpty(pstack))
    {
        printf("Stack Memory Error!");
        exit(-1);
    }

    rIdx = pstack -> topIndex;  //삭제할 데이터가 저장된 인덱스 값 저장
    pstack -> topIndex -= 1;    //pop연산의 결과로 topIndex 값 하나 감소

    return pstack -> stackArr[rIdx];    //삭제되는 데이터 반환
}

Data SPeek(Stack * pstack)
{
    if(SIsEmpty(pstack))
    {
        printf("Stack Memory Error!");
        exit(-1);
    }

    return pstack -> stackArr[pstack -> topIndex];
}

