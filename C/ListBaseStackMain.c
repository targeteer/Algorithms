#include <stdio.h>
#include "ListBaseStack.h"
#include "ListBaseStack.c"

int main(void)
{
    Stack stack;
    StackInit(&stack);

    SPush(&stack, 1);
    SPush(&stack, 3);
    SPush(&stack, 43);
    SPush(&stack, 33);

    while(!SIsEmpty(&stack))
    {
        printf("%d \n", SPop(&stack));
    }
}