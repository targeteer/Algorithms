#include <stdio.h>
#include <stdlib.h>

#include "SimpleHeap.h"

void HeapInit(Heap * hp)
{
    hp->numOfData = 0;  
}

int HIsEmpty(Heap * hp)
{
    if(hp->numOfData == 0)
        return TRUE;
    else   
        return FALSE;
}

int GetParentIDX(int idx)
{
    return idx/2;
}

int GetLChildIDX(int idx)
{
    return idx*2;
}

int GetRChildIDX(int idx)
{
    return idx*2 + 1;
}

int GetHiPriChildIDX(Heap * hp, int idx)
{
    if(GetLChildIDX(idx) > hp->numOfData)
        return 0;
    else if(GetLChildIDX(idx) == hp->numOfData)  //자식 노드가 왼쪽 자식 노드 하나만 존재한다면,
        return GetLChildIDX(idx);
    else
    {
        if(hp->heapArr[GetLChildIDX(idx)].pr
            > hp->heapArr[GetRChildIDX(idx)].pr)
            return GetRChildIDX(idx);  //숫자가 낮아야 우선순위가 높다
        else   
            return GetLChildIDX(idx);
    }
}

void HInsert(Heap * hp, HData data, Priority pr)
{
    int idx = hp->numOfData + 1;
    HeapElem nelem = {pr, data};

    while(idx != 1)
    {
        if(pr < (hp->heapArr[GetParentIDX(idx)].pr))
        {
            hp->heapArr[idx] = hp->heapArr[GetParentIDX(idx)]; //부모 노드를 한 레벨 내림, 실제로 내림
            idx = GetParentIDX(idx); //새 노드를 한 레벨 올림, 실제로 올리지는 않고 인덱스 값만 갱신
        }
        else
            break;
    }
    hp->heapArr[idx] = nelem; //새 노드를 배열에 저장
    hp->numOfData += 1;
}

HData HDelete(Heap * hp)
{
    HData retData = (hp->heapArr[1]).data;  //반환을 위해서 삭제할 데이터 저장
    HeapElem lastElem = hp->heapArr[hp->numOfData]; //힙의 마지막 노드 저장

    //아래의 변수 parentIdx에는 마지막 노드가 저장될 위치정보가 담긴다
    int parentIdx = 1;  //루트 노드가 위치해야 할 인덱스 값 저장
    int childIdx;

    //루트 노드의 우선순위가 높은 자식 노드를 시작으로 반복문 시작
    while(childIdx = (GetHiPriChildIDX(hp, parentIdx)))
    {
        if(lastElem.pr <= hp->heapArr[childIdx].pr) //마지막 노드와 우선순위 비교
            break;  //마지막 노드의 우선순위가 높으면 반복문 탈출!

        //마지막 노드보다 우선순위 높으니, 비교대상 노드의 위치를 한 레벨 올림
        hp->heapArr[parentIdx] = hp->heapArr[childIdx];
        parentIdx = childIdx;   //마지막 노드가 저장될 위치정보를 한 레벨 내림
    }   //반복문 탈출하면 parentIdx에는 마지막 노드의 위치정보가 저장됨
    
    hp->heapArr[parentIdx] = lastElem;  //마지막 노드 최종 저장
    hp->numOfData -= 1;
    return retData;
}