#include <stdio.h>
#include "ArrayList.h"
#include "ArrayList.c"

int main(void)
{
        //ArrayList의 생성 및 초기화
        List list;
        int data;
        ListInit(&list);

        LInsert(&list, 11);
        LInsert(&list, 22);
        LInsert(&list, 33);
        LInsert(&list, 44);
        LInsert(&list, 55);

        printf("현재 데이터의 수:%d \n", LCount(&list));

        //저장된 데이터의 전체 출력
        if(LFirst(&list, &data))
        {
            printf("%d ", data);

            while(LNext(&list, &data))
            {
                printf("%d ",data);
            }
        }

        //숫자 22를 탐색하여 모두 삭제
        if(LFirst(&list, &data))
        {
            if(data == 22)
                Remove(&list);

            while(LNext(&list, &data))
            {
                if(data == 22)
                    Remove(&list);
            }
        }
        
        

        //삭제 후 남은 데이터 출력
        printf("현재 데이터의 수: %d \n", LCount(&list));

        if(LFirst(&list, &data))
        {
            printf("%d ", data);
            while(LNext(&list, &data))
            {
                printf("%d ", data);
            }
        }
        return 0;
        
}