#include <stdio.h>
#include "ArrayList.h"
#include "ArrayList.c"

int main(void)
{
        List list;
        int data, i;
        int sum = 0;
        ListInit(&list);

        for(i=1; i<10; i++)
            LInsert(&list, i);

        if(LFirst(&list, &data))
        {
            sum+= data;
            
            while(LNext(&list, &data))
                sum += data;
        }
        printf("SUM=%d, \n", sum);

        //2, 3의 배수 삭제

        if(LFirst(&list, &data))
        {
            if(data%2 == 0 || data%3 == 0)
                Remove(&list);

            while(LNext(&list, &data))
            {
                if(data%2 == 0 || data%3 == 0)
                    Remove(&list);
            }
        }

        //삭제 후 저장된 데이터 전체 출력
        if(LFirst(&list, &data))
        {
            printf("%d", data);
            
            while(LNext(&list, &data))
                printf("%d", data);
        }

        printf("\n\n");
        return 0;
}